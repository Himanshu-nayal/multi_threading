import java.util.stream.IntStream;

public class ThreadExample implements Runnable
{
    public  static void main(String[] args) throws InterruptedException {
        ThreadExample threadExample=new ThreadExample();
        Method1(threadExample);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.printf("Start of %s\n",name);
            Thread.sleep(15000);
            System.out.printf("End of %s\n",name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void Method1(ThreadExample threadExample) throws InterruptedException {
        Thread thread=new Thread(threadExample,"Thread 1");
        Thread thread2=new Thread(threadExample,"Thread 2");

        thread2.start();

        thread2.join();

        thread.start();


    }

}


