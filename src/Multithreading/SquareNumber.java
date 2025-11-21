package Multithreading;

import java.util.concurrent.Callable;

public class SquareNumber implements Callable<Integer> {
    int x;

    public SquareNumber(int x) {
        this.x = x;
    }
    @Override
    public Integer call() throws Exception {
        return x*x;
    }
}
