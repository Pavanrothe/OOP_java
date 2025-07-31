class Overloding{
int Id;
int salary;
String Name;
String dipartment;

public Overloding()
{
Id=1056;
salary=3848944;
Name="Pavan_Rothe";
dipartment="IT";
System.out.println("id="+Id);
System.out.println("Name="+Name);
System.out.println("Salary="+salary);
System.out.println("Dipartment="+dipartment);
}

public Overloding(String N,int id)
{
Id=id;
Name=N;
System.out.println("id="+Id);
System.out.println("Name="+Name);
}

public Overloding(String N,String d,int id)
{
Id=id;
Name=N;
dipartment=d;
System.out.println("id="+Id);
System.out.println("Name="+Name);
System.out.println("Dipartment="+dipartment);
}

public Overloding(String N,String D,int id,int sal)
{
Id=id;
salary=sal;
Name=N;
dipartment=D;
System.out.println("id="+Id);
System.out.println("Name="+Name);
System.out.println("Salary="+salary);
System.out.println("Dipartment="+dipartment);
}
public static void main(String args[])
{
Overloding o=new Overloding();
Overloding o1=new Overloding("pavan",1035);
Overloding o2=new Overloding("pavan rothe","IT",345278);
Overloding o3=new Overloding("Pavan ","It",3432,34687319);

}
}

