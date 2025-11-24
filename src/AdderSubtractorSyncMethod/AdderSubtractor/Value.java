package AdderSubtractorSyncMethod.AdderSubtractor;

public class Value {
    int x;

    synchronized void increment( int i){
        x += i;
    }

    synchronized void decrement( int i){
        x -= i;
    }
}
