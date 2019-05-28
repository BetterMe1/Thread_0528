package exercise.thread_0522;

class NameThread implements Runnable{
    private int ticket = 20;
    public void run(){
        while(ticket > 0){
            System.out.println("当前线程："+Thread.currentThread().getName()+"剩余:"+(--ticket));
        }
    }
}
public class ThreadName {
    public static void main(String[] args) {
        NameThread nameThread = new NameThread();
        Thread thread1 = new Thread(nameThread);
        Thread thread2 = new Thread(nameThread,"线程2");
        Thread thread3 = new Thread(nameThread,"线程3");
        thread1.setName("线程1");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
