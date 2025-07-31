public class Employee1
{int emp_id,salary;
String name;
Employee1(int id,int sal,String s)
{
emp_id=id;
name=s;
salary=sal;
}
void display()
{
System.out.println("!!!Employee Informetion!!!");
System.out.println("Employee id:"+emp_id);
System.out.println("Employee name:"+name);
System.out.println("Employee salary:"+salary);
}
public static void main(String args[])
{
Employee1 e=new Employee1(105,50000,"powede");
e.display();

}
}