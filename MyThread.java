// thread By Extending Thread Class
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("Thread is running using Thread Class");
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
