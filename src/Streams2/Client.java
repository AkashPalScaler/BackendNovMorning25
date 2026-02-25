package Streams2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(2, 3, 2, 5, 3, 6,1, 7, 8, 10,8, 12, 2, 5));

        Stream<Integer> stream = list.stream();

        List<Integer> list2 = new ArrayList<>();

        // Terminal Ops(forEach, collect, findFirst) and Intermediate ops (distinct, filter, map, count, limit)
        stream.distinct().forEach((x) -> {
            list2.add(x*x);
        });

        List<Integer> list3 = list.stream().distinct().collect(Collectors.toList());
        List<Integer> list4 = list.stream().distinct().toList();

        System.out.println("List 4" + list4);

        List<Integer> list5 = list.stream()
                .distinct()
                .filter((x)-> {
                    return x%2 == 0;
                }).toList();

        System.out.println("List 5 : " + list5);

        List<Integer> list6 = list.stream()
                .distinct()
                .filter((x)-> {
                    System.out.println("Filtering ->" + x);
                    return x%2 == 0;
                })
                .map((x) -> {
                    System.out.println("Mapping ->" + x);
                    return x*x;
                })
                .limit(2)
                .toList();
        System.out.println("List 6 : " + list6);

//        List<Integer> list7 = list.stream()
//                .distinct()
//                .filter(new MyPredicate())
//                .map((x) -> {
//                    System.out.println("Mapping ->" + x);
//                    return x*x*x;
//                })
//                .limit(2)
//                .toList();
//
//
//        System.out.println("List 7 : " + list7);
        // Single pass calculations
        // Lazy calculation

        int s =0;
        for(Integer x: list6){
            s += x;
        }
        List<Integer> temp = new ArrayList<>();
        Integer total = list5.stream().reduce(0, (sum, x) -> {
            temp.add(x);
            return sum + x;
        });

        // accumulator<Array, Array, Integer>
        System.out.println("Total " + total);
//        List<Integer> temp = new ArrayList<>();
//        List<Integer> list8 = list7.stream().reduce(temp, (y, x)-> {
//            return temp.add(x);
//        });
    }
}
//list1
// filter(loop through all values and get filtered vals) {
//   list2 = filtering list1
//}
// map(loop through all value and map){
// list3= filtering list2
//}
//list5
// One function : distinctFilterMap(){
//  // filterLogic : even filters
//}

//list6: 2nd func : filterMapFilterDistinct(){
//}
