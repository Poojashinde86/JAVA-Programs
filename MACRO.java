import java.util.*;
import java.io.*;

class MACRO
{
static String mnt[][]=new String[5][3]; //assuming 5 macros in 1 program
static String ala[][]=new String[10][2]; //assuming 2 arguments in each macro
static String mdt[][]=new String[20][1]; //assuming 4 LOC for each macro
static int mntc=0,mdtc=0,alac=0;//initialize the varaibles macro name table counter, macro defination counter, argument list array

public static void main(String args[])//main method prg
{
pass1();//when we call the pass1 we directly jump on static void method
System.out.println("\n*********PASS-1 MACROPROCESSOR***********\n");//final step all table is display as output this format
System.out.println("MACRO NAME TABLE (MNT)\n");
System.out.println("i macro loc\n");
display(mnt,mntc,3);//particular varaible we are going to pass
System.out.println("\n");
System.out.println("ARGUMENT LIST ARRAY(ALA) for Pass1\n");
display(ala,alac,2);
System.out.println("\n");
System.out.println("MACRO DEFINITION TABLE (MDT)\n");
display(mdt,mdtc,1);
System.out.println("\n");
}

static void pass1()
{
int index=0,i;
String s,prev="",substring;//3 varaibles are declare

	try
{
BufferedReader inp = new BufferedReader(new FileReader("macro_input.asm"));//inp is the object
File op = new File("pass1_output.txt");

if (!op.exists())
op.createNewFile();
BufferedWriter output = new BufferedWriter(new FileWriter(op.getAbsoluteFile()));

while((s=inp.readLine())!=null)//read content line by line with inp object
{
if(s.equalsIgnoreCase("MACRO"))
{
prev=s;
for(;!(s=inp.readLine()).equalsIgnoreCase("MEND");mdtc++,prev=s)
{
if(prev.equalsIgnoreCase("MACRO"))
{
	
//start	here
StringTokenizer st=new StringTokenizer(s);//create the various the tokens(delimiter like symbols,namees)
String str[]=new String[st.countTokens()];//method of how token it creates
for(i=0;i<str.length;i++)
str[i]=st.nextToken();
mnt[mntc][0]=(mntc+1)+""; //mnt formation
mnt[mntc][1]=str[0];
mnt[mntc++][2]=(++mdtc)+"";
//end here this program to is use to fill the macro name table

//start here
st=new StringTokenizer(str[1],","); //tokenizing the arguments
String string[]=new String[st.countTokens()];
for(i=0;i<string.length;i++)
{
string[i]=st.nextToken();
ala[alac][0]=alac+""; //ala table formation
index=string[i].indexOf("=");
if(index!=-1)
ala[alac++][1]=string[i].substring(0,index);
else
ala[alac++][1]=string[i];
}
}
//end here upper this program to fill the argument table


else //automatically eliminates tagging of arguments in definition(is it macro defination table)
{ //mdt formation
index=s.indexOf("&");
substring=s.substring(index);
for(i=0;i<alac;i++)
if(ala[i][1].equals(substring))
s=s.replaceAll(substring,"#"+ala[i][0]);//symbols storing using # in ala
}
mdt[mdtc-1][0]=s;
}
mdt[mdtc-1][0]=s;
}
else
{
output.write(s);//
output.newLine();//close the file
}
}
output.close();
}
	catch(FileNotFoundException ex)
{
System.out.println("UNABLE TO END FILE ");
}
	catch(IOException e)
{
e.printStackTrace();
}
}

static void display(String a[][],int n,int m)
{
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
}
}
