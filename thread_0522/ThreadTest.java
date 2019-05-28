package exercise.thread_0522;

/*
class MyThread extends Thread{
    private int ticket = 20;
    public void run(){
        while(ticket > 0){
            System.out.println("当前线程："+Thread.currentThread().getName()+"剩余:"+(--ticket));
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
*/

class MyThread implements Runnable{
    private int ticket = 20;
    public void run(){
        while(ticket > 0){
            System.out.println("当前线程："+Thread.currentThread().getName()+"剩余:"+(--ticket));
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
