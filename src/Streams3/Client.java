package Streams3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 3,5,1,2,3,6,4,7,1,8,4,5,7));

        //Filter using predicate type interface
        List<Integer> list1 = list.stream().filter((x) -> {
            return x%2 == 0;
        }).toList();

        System.out.println("List 1 :" + list1);

        // Map - Function type interface
        List<Integer> list2 = list.stream().distinct()
                .map((x) -> x*x).toList();

        System.out.println("List 2 : " + list2 );

        // Reduce : List of type T and reduce it to a single value of type T
        // Sum, Factorial, Find Max

        Integer total = 0;
        for(Integer x : list1){
            total = total +  x;
        }

        Integer finalSum = list.stream()
                .reduce(0, (sum, x) -> {
//                    System.out.println("Sum. :" + sum);
                    return sum + x;
                });

        System.out.println("Final sum :" + finalSum);


        List<Integer> list3 = list.stream()
                .distinct()
                .map((x) -> {
                    System.out.println("Mapping -> " + x);
                    return x*x;
                })
                .filter((x) -> {
                    System.out.println("Filtering -> " + x);
                    return x%2==0;
                })
                .limit(2)
                .toList();

        // Single pass
        // Lazy calculation

        // Break till 8:38 PM


    }
}
