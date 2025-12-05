package Collections;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private Integer marks;
    private Integer age;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer marks, Integer age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        //this, o
        // Decreasing
        // If 'this' is bigger than 'o' - Do I want to swap? No
//        if(this.age >= o.age){
//            return -1; // Return any negative number or 0
//        }else{
//            return 1; // Return any positive number
//        }

        return o.age - this.age; // this.age > o.age = -ve

    }
}
