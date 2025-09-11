public class Thro_Exseption{

public static void main(String args[])
{
int a=10;
int b=0;

if(b==0)
{
throw new ArithmeticException("you can no divide number by zero");
}
else
{
int c=a/b;
System.out.println("division is:"+c);
}
System.out.println("Addition is:"+(a+b));
}
}