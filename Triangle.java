import java.util.*;
class Area{
double p,q;
public double area(double a,double b){
p=a;
q=b;
return 0.5*a*b;
}
}//modularity

public class Triangle{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the base and hight of triangle");
double b=sc.nextDouble();
double h=sc.nextDouble();
Area a=new Area();
System.out.println("Area of triangle is:"+a.area(b,h));
}
}
