package CopyContructor;

public class Student {
    private String name;
    private int age;
    public Exam exam;

    public Student(String name, int age, Exam exam) {
        this.name = name;
        this.age = age;
        this.exam = exam;
    }

    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.exam = new Exam(student.exam);
    }
}
