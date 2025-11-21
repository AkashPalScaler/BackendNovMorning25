package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    int size;
    ExecutorService es;
    public Sorter(List<Integer> arrayToSort, ExecutorService es) {
        this.arrayToSort = arrayToSort;
        this.size = arrayToSort.size();
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(size == 1) {
            System.out.println("");
            return arrayToSort;
        }

        int mid = size/2;

        List<Integer> LeftArrToSort = new ArrayList<>();
        List<Integer> RightArrToSort = new ArrayList<>();

        for(int i=0;i<mid;i++){
            LeftArrToSort.add(arrayToSort.get(i));
        }
        for(int i=mid;i<size;i++){
            RightArrToSort.add(arrayToSort.get(i));
        }

        Sorter leftSorter = new Sorter(LeftArrToSort, es);
        Sorter rightSorter = new Sorter(RightArrToSort, es);

//        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<List<Integer>> leftArrSorterFuture = es.submit(leftSorter);
        Future<List<Integer>> rightArrSorterFuture = es.submit(rightSorter);

        List<Integer> leftSortedArr = leftArrSorterFuture.get();
        List<Integer> rightSortedArr = rightArrSorterFuture.get();

        return merge(leftSortedArr, rightSortedArr);
    }

    public List<Integer> merge(List<Integer> sortedLeftArray, List<Integer> sortedRightArray){
        // Merging the two sorted arrays
        int i= 0; // start of left
        int j = 0; //start of right

        ArrayList<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}
