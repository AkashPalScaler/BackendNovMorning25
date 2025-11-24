package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value val = new Value();
        ReentrantLock lock = new ReentrantLock();
        Adder adder  = new Adder(val, lock);
        Subtractor subtractor = new Subtractor(val, lock);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtFuture = es.submit(subtractor);

        adderFuture.get();
        subtFuture.get();

        System.out.println("Value of val.x =" + val.x);
    }
}
