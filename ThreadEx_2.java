class Thread implements Thread1{

public void run(){
System.out.println("thread is running");
}
}

public class ThreadEx_2{

public static void main(String args[])
{
Thread th=new Thread();
th.start();
}
}