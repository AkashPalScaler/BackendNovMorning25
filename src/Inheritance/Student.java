package Inheritance;

public class Student extends User{
    String psp;

    public Student() {
        //Call User Constructor - super()
//        super("Akash"); // Refers to parent constructor

        System.out.println("Student constructor");
    }
}
// A -> B -> C -> D | Experiment and Play around