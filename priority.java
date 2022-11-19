//preemptive
import java.util.Scanner;
public class priority 
{
public static void main(String args[]) 
{
Scanner s = new Scanner(System.in);//create object class of scanner for input
int x,n,p[],pp[],bt[],w[],t[],i;//declare data structure
float awt,atat;																					//all process are in ready queue

p = new int[10];//initialize all the data structure and creating a memory
pp = new int[10];
bt = new int[10];
w = new int[10];
t = new int[10];
//n is number of process
//p is process
//pp is process priority
//bt is process burst time
//w is wait time
// t is turnaround time
//awt is average waiting time
//atat is average turnaround time

System.out.print("Enter the number of process : ");
n = s.nextInt();
System.out.print("\n\t Enter CPU time---priority \n");
for(i=0;i<n;i++)//burst time and prority
{
System.out.print("\nProcess["+(i+1)+"]:");
bt[i] = s.nextInt();
pp[i] = s.nextInt();
p[i]=i+1;
}
//sorting on the basis of priority
for(i=0;i<n-1;i++)//hre we take two loop for perfoming operations of sorting
{
for(int j=i+1;j<n;j++)
{
if(pp[i]<pp[j])//values compare i & j
{
x=pp[i];
pp[i]=pp[j];//prority array
pp[j]=x;

x=bt[i];
bt[i]=bt[j];//burst time array						//3 arrays are here we perform
bt[j]=x;

x=p[i];
p[i]=p[j];//process array
p[j]=x;
}
}
}
w[0]=0;//first process is always zero
awt=0;
t[0]=bt[0];
atat=t[0];
for(i=1;i<n;i++)
{
w[i]=t[i-1];
awt+=w[i];	//compute waiting time
t[i]=w[i]+bt[i];
atat+=t[i];	//compute turnaround time
}
//Displaying the process
System.out.println("-----------------------------------------------------------------------------");
System.out.print("\n\nProcess \t |Priority \t |Burst Time \t |Wait Time \t |Turn Time \n");
System.out.println("-----------------------------------------------------------------------------");
for(i=0;i<n;i++)
System.out.print("\n"+p[i]+"\t\t| "+pp[i]+"\t\t| "+bt[i]+"\t\t|"+w[i]+"\t\t| "+t[i]+"\n");
System.out.println("-----------------------------------------------------------------------------");
awt/=n;
atat/=n;
System.out.print("\n Average Wait Time : "+awt);
System.out.print("\n Average Turn Around Time : "+atat);
}
}
