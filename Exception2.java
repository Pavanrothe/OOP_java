public class Exseption2{
public static void main(String args[])
{
int a=10,b=0;
int c;

c=a-b;
System.out.println("Substraction is:"+c);

c=a+b;
System.out.println("Addition is:"+c);

c=a*b;
System.out.println("mul. is:"+c);

try
{
c=a/b;
System.out.println("div. is:"+c);
}
catch(Exception e)
{
System.out.println("you can not divide no. by zero:"+e);
}


}
}