class Student
{
int roll_no=104;
String name="pavan";
String dipartment="IT";
void info()
{
System.out.println("Name="+name);
System.out.println("Roll_no="+roll_no);
System.out.println("Dipartment="+dipartment);
}
}
class Sem1_CGPA extends Student
{
void sgpa1()
{
System.out.println("sgpa_ sem1=8.5");
}
}
class Sem2_CGPA extends Sem1_CGPA
{
void sgpa2()
{
System.out.println("sgpa_ sem2=8.5");
}
}
public class Multylevel_I
{
public static void main(String args[])
{
Sem2_CGPA s=new Sem2_CGPA();
s.info();
s.sgpa2();
s.sgpa1();
}
}



