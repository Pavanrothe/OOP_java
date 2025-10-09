public class Multi2 implements Runnable
{
public void run()
{
for(int i=0; i<5; i++)
System.out.println("Thread is " +Thread.currentThread().getName()+" running");
}
public static void main(String args[])
{
Multi2 m = new Multi2();
Thread t1= new Thread(m,"Sanjivani");
Thread t2= new Thread(m,"Amrutvahini");
Thread t3= new Thread(m,"Pravara");

t1.start();
t2.start();
t3.start();
}
}