class test
{
public static void main(String args[])
{
 int f0=0,f1=1,f2=1,i;
System.out.println(f0);
System.out.println(f1);
for(i=0;i<10;i++)
{
f2=f0+f1;
f0=f1;
f1=f2;


System.out.println(f2);
}




}
}