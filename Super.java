//super keyword is use to call a parent class without creating object in main class.
class Shape{
public void area()
{
System.out.println("!!!Area in Shape class!!!");
}
}
class Circle extends Shape{
public void area()
{
super.area();
System.out.println("!!!Area in Circle class!!!");
}
}
class Super{
public static void main(String args[])
{
Circle c=new Circle();
c.area();
}
}