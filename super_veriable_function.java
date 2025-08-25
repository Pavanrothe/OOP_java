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
public class super_veriable_function{

public static void main(String args[])
{
Circle c=new Circle();
c.area();
}
}