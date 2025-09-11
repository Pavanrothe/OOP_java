public class ArrayTest1{
public static void main(String args[])
{
try{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=a+b;
System.out.println("a+b="+c);
}
catch(Exception e)
{
System.out.println("enter 2 values:"+e);
}

}
}