package MultiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(8,9,4,5,3,2,1,6,7);
        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedArrFuture = es.submit(new Sorter(arrayToSort, es));
        List<Integer> sortedArr = sortedArrFuture.get();
        System.out.println(sortedArr);
    }
}
