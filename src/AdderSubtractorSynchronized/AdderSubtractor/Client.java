package AdderSubtractorSynchronized.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value val = new Value();
        Object obj = new Object();
        Adder adder  = new Adder(val, obj);
        Subtractor subtractor = new Subtractor(val, obj);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtFuture = es.submit(subtractor);

        adderFuture.get();
        subtFuture.get();

        System.out.println("Value of val.x =" + val.x);
    }
}
