public class Employee3
{int emp_id,salary;
String name;
Employee3(int id,int sal,String s)
{
emp_id=id;
name=s;
salary=sal;
}
public Employee3(Employee3 obj)
{
emp_id=obj.emp_id;
name=obj.name;
salary=obj.salary;
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
Employee3 e=new Employee3(105,50000,"powede");

Employee3 e1=new Employee3(e);
e1.display();

}
}
