class Binary
{
 public static void main(String args[])
    {
        boolean b = true;
        int  number=1101;
        while (number != 0)
        {
            int temp = number%10;   
            if(temp > 1)
            {
          b= false;
                break;
            }
            else
            {
               number=number/10;
            }
        }
        if (b)
        {
            System.out.println(" It is a binary number");
System.out.println("Name :- shinde pooja shashikant");
System.out.println("Batch :- c");
System.out.println("Roll no :- 52");

        }
        else
        {
            System.out.println( "It is not a binary number");
System.out.println("Name :- shinde pooja shashikant");
System.out.println("Batch :- c");
System.out.println("Roll no :- 52");

        }
    }
}
