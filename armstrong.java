class test
{
public static void main(String[] args)
{
int temp=153,n=153,a,c=0;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
{
System.out.print("Number is armstrong");
}
}
}