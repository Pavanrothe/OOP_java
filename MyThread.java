public class MyThread extends Thread {
public void run() {
System.out.println("run method in thread class");
}
public static void main(String args[]) {
MyThread thread = new MyThread();
thread.start();
}
}
