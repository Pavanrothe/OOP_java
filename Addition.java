import java.util.Scanner;
public class Addition{
public static void main(String args[])
{
int a,b,ans;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first no: ");
a=sc.nextInt();
System.out.print("Enter second no: ");
b=sc.nextInt();
ans=a+b;
System.out.println("Addition is: "+ans);
}
}