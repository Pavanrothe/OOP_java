
//method oveloding
class Shape{
public void area()
{
int a=10;
int b=20;
int t=a*b;
System.out.println("Area of ractangle is:"+t);
}
public double area(int a,int b)
{
double t=0.5*a*b;
return t;
}
public double area(int r)
{
double t=3.14*r*r;
return t;
}
public static void main(String args[])
{
Shape s=new Shape();
s.area();
System.out.println("Area of triangle:"+s.area(15,23));
System.out.println("Area of circle:"+s.area(15));
}/*we can float falue in double*/

}