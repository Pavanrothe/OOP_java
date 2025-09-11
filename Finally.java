import java.util.*;
public class Finally{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number1");
int n1=sc.nextInt();
System.out.println("Enter the number2");
int n2=sc.nextInt();
System.out.println("-------------------------------------------------------");
try{
double d=n1/n2;
System.out.println("division is : "+d);
}
catch(Exception e)
{
System.out.println("!!!we can not divide number by zero!!!");
}
finally{
System.out.println("value of No.1: "+n1+"   &   No.2: "+n2);
System.out.println("-------------------------------------------------------");
}
}
}
