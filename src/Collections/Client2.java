package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        //Comparable and Comparator

        System.out.println(Integer.compare(10, 20));
        System.out.println(Integer.compare(20,10));

        ArrayList<Integer> arrs = new ArrayList<>(List.of(2,3,4,5,1,9,8,5));
        Collections.sort(arrs);

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Akash", 97, 29));
        students.add(new Student("Reshma", 93, 21));
        students.add(new Student("Gourav", 99, 26));
        students.add(new Student("Deepak", 92, 27));
        students.add(new Student("Dipika", 87, 31));
        students.add(new Student("Nikhil", 86, 28));
        students.add(new Student("Arvind", 100, 33));

        Collections.sort(students);

        for (Student s: students){
            System.out.println(s.getName() + " " + s.getMarks() + " " + s.getAge());
        }
        System.out.println("********************");
        Collections.sort(students, new StudentMarksComparator());
        for (Student s: students){
            System.out.println(s.getName() + " " + s.getMarks() + " " + s.getAge());
        }

    }
}
