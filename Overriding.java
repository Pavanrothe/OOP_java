class Shape{
public void area()
{
System.out.println("Area in Shape class");
}
}
class Circle extends Shape{
public void area()
{
System.out.println("!!!Area in Circle class!!!");
}
}
class Overriding{
Circle c=new Circle();
c.area();
}