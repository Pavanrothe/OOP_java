class Shape{
public Shape(int val)
{
System.out.println("constructor of parrent class:"+val);
}
}
class Circle extends Shape{
public Circle()
{
super(15);
System.out.println("constructor of parrent class:");
}
}
class super_cunstructor {
    public static void main(String args[]) {
        Circle c = new Circle();
    }
}