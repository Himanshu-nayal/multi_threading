import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ans2NewCachedThreadPool {

    public static void main(String[] args) {


        Runnable task1 = () ->
        {
            try {
                Thread.sleep(1000);
                System.out.println("TASK 1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        };
        Runnable task2 = () ->
        {
            try {
                Thread.sleep(1000);
                System.out.println("TASK 2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i <= 5; i++) {
            executorService.execute(task1);
            executorService.execute(task2);
        }

    }
}