import java.util.*;
class Area_of_circle{
void area(double r)
{
double a;
a=3.14*r*r;
System.out.println("area of circle is:"+a);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the redius of circle:");
double r=sc.nextDouble();
Area_of_circle A=new Area_of_circle();
A.area(r);
}
}