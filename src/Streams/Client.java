package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 3, 4, 6,8,9,7, 1, 3, 5, 4, 5));
//
//        Stream<Integer> stream = list.stream();
//
//        // Terminal ops - forEach
//        list.stream().forEach((x) -> {
//            System.out.print(x + ",");
//        });
//        System.out.println();
//        // Intermediate ops - distinct
//        list.stream()
//                .distinct()
//                .forEach((x) -> System.out.print(x + ","));
//        System.out.println();
//
//        // Terminal ops - collect
////        List<Integer> distinctList1 = list.stream()
////                .distinct()
////                .collect(Collectors.toList());
//
//        List<Integer> distinctList2 = list.stream()
//                .distinct()
//                .toList();
//        System.out.println(distinctList2);
//
//        // Intermediate ops - Filter
//        System.out.println("Filter results :");
//        list.stream()
//                .distinct()
//                .filter((x) ->  x%2 == 0 )
//                .forEach((x) -> System.out.print(x + ","));
//        System.out.println();

//        for(Integer x : list){
//            if(x%2 == 0){
//                System.out.print(x + ",");
//            }
//        }

        // Intermediate ops - Map
//        System.out.println("Map results :");
//        list.stream()
//                .distinct()
//                .filter((x) ->  x%2 == 0 )
//                .map((x) -> x*x)
//                .forEach((x) -> System.out.print(x + ","));
//        System.out.println();

        // Intermediate ops - Map
//        System.out.println("Map collect results :");
//        List<Integer> mappedList = list.stream()
//                .filter((x) -> {
//                    System.out.println("Filtering " + x);
//                    return x % 2 == 0;
//                })
//                .map((x) -> {
//                    System.out.println("Mapping " + x);
//                    return x*x;
//                })
//                .limit(4)
//                .toList();
//        System.out.println(mappedList);
        // Optimization
        // It's a single pass operation
        // Lazy evaluation

//        System.out.println("Map collect results :");
//        List<Double> mappedList2 = list.stream()
//                .distinct()
//                .filter((x) ->  x%2 == 0 )
//                .map(new Function<Integer, Double>() {
//                    @Override
//                    public Double apply(Integer integer) {
//                        if(integer > 0){
//                            return 0.0;
//                        }
//                        return 1.0;
//                    }
//                })
//                .toList();
//        System.out.println(mappedList);
    list.stream().map(new SomeFunClass());

        List<Integer> emptylist = new ArrayList<>();

        emptylist.stream()
        .reduce(0, (item1, item2) ->
        {
            System.out.println("Item 1 " + item1 + " item 2 " + item2);
            return Math.max(item1, item2);
        });


    }

    static int someFun(double x){
            int y =  (int) x;
            return y;
    }
}
