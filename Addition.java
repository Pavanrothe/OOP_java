class Addition{
public void add(){
int a=10;
int b=30;
int c=a+b;
System.out.println("Addition of two numbers are:"+c);
}
public double add(double a,double b)
{
double c=a+b;
return c;
}
public float add(float a,float b)
{
float c=a+b;
return c;
}
public int add(int a,int b)
{
int c=a+b;
return c;
}
public static void main(String args[])
{
Addition a=new Addition();
a.add();
System.out.println("addition of two integers:"+a.add(15,34));
System.out.println("addition of two double val:"+a.add(23.34,54.43));
System.out.println("addition of two float val:"+a.add(23.5f,21.5f));
}//static polymorfisum,compiltime polymorfisum
}