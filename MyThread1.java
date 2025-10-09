public class MyThread1 implements Runnable {
    public void run() {
        System.out.println("run in MyThread");
    }

    public static void main(String args[]) {
        MyThread1 m1 = new MyThread1();
        Thread t = new Thread(m1); 
        t.start();
    }
}
