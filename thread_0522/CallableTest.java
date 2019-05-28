package exercise.thread_0522;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callablethread callablethread = new Callablethread();
        FutureTask<String> futureTask = new FutureTask<>(callablethread);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
class Callablethread implements Callable<String>{
    private int ticket = 20;
    @Override
    public String call() throws Exception {
        while(ticket >0){
            System.out.println("当前线程"+Thread.currentThread().getName()+"剩余："+(--ticket));
        }
        return "客官~~明天再来哦~~";
    }
}
