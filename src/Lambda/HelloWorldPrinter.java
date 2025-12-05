package Lambda;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World -> " + Thread.currentThread().getName());
        // any other function getting called from here -> is run on this thread
    }
}
