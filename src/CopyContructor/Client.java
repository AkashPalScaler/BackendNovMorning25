package CopyContructor;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("Akash", 29, new Exam(1, 90));
        Student scopy = new Student(s);
        scopy.exam.marks = 20;
        System.out.println("DEBUG");
    }
}
