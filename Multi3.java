public class Multi3 implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
System.out.println("Thread "+Thread.currentThread().getName()+" is running");
}
public static void main(String[] args)
{
Multi3 m=new Multi3();
Thread t1=new Thread(m,"Sanjivani  ");
Thread t2=new Thread(m,"Amrutvahini");
Thread t3=new Thread(m,"Pravara    ");
//t1.start();
//t2.start();
//t3.start();
t1.setPriority(1);
t1.setPriority(2);
t1.setPriority(3);
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
System.out.println(t3.getPriority());
}
}