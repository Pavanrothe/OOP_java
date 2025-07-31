import java.util.*;
class Area_of_trangle{

void Area(float b,float h)
{
float A;
A=0.5*b*h;
System.out.println("area of trangle is:"+A);
}
public static void main(String args[])
{
float b,h;
Scanner sc=new Scanner(System.in);
Area_of_trangle AA=new Area_of_trangle();
System.out.println("enter the base of trangle:");
b=sc.nextFloat();
System.out.println("enter the hight of trangle:");
h=sc.nextFloat();
aa.Area(b,h);
}
}
