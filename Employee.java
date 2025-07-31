
public class Employee
{int emp_id,salary;
String name;
Employee()
{
emp_id=104;
name="ram";
salary=25000;
}
public static void main(String args[])
{
Employee e=new Employee();
System.out.println("!!!Employee Informetion!!!");
System.out.println("Employee id:"+e.emp_id);
System.out.println("Employee name:"+e.name);
System.out.println("Employee salary:"+e.salary);

}
}