package AdderSubtractorSyncMethod.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void> {
    Value val;
    ReentrantLock lock;

    public Subtractor(Value val, ReentrantLock lock) {
        this.val = val;
        this.lock = lock;
    }


    @Override
    public Void call() throws Exception { // It user 'this' object's lock
        for(int i=0;i<100;i++){
            val.decrement(i);
            System.out.println("Value is decremented to " + val.x);
        }
        return null;
    }
}
// Break till 8:13 AM
