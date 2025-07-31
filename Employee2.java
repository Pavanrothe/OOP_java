import java. util.*;
public class Employee2
{int emp_id,salary;
String name;
Employee2()
{Scanner sc=new Scanner(System.in);
System.out.println("enter the id:");
int id=sc.nextInt();
System.out.println("enter the salary:");
int sal=sc.nextInt();
sc.nextLine();
System.out.println("enter the name:");
String s=sc.nextLine();


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
Scanner sc=new Scanner(System.in);



System.out.println("how many employees informetion you want to insert:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
Employee2 e=new Employee2();
}
e.display();

}
}