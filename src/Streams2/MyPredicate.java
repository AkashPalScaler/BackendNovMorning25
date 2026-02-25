package Streams2;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer x) {
        return x%2 == 1;
    }
}
