class prime
{
public static void main(String[] args)
{
int i, j, n, sum=0;
for(i=2; i<=1000; i++)
{
n = 1;
for(j=2; j<=i/2 ;j++)
{
if(i%j==0)
{
n = 0;
break;
}
}
if(n==1)
{
sum += i;
}
}
System.out.println(sum);
System.out.println("Name :- shinde pooja shashikant");
System.out.println("Batch :- c");
System.out.println("Roll no :- 52");
}
}