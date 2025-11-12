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
class Sem1_Subject extends Student
{
void subjects()
{
System.out.println("M1,chemistry,bxe,bee,fds,ite");
}
}
public class Harachical
{
public static void main(String args[])
{
Sem1_CGPA s=new Sem1_CGPA();
Sem1_Subject s1=new Sem1_Subject();
s.info();
s1.info();
s.sgpa1();
s1.subjects();
}
}