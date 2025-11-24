package AdderSubtractorSynchronized.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void> {
    Value val;
    Adder adder;
    Object obj;

    public Subtractor(Value val, Object obj) {
        this.val = val;
        this.obj = obj;
    }


    @Override
    public Void call() throws Exception {
        for(int i=0;i<10000;i++){
            synchronized (obj){ // Adder
                val.x -= i;
//                System.out.println("Value is decremented to " + val.x);
            }
        }
        return null;
    }
}
// Break till 8:13 AM
