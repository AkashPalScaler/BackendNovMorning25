package CopyContructor;

public class Exam {
    int id;
    int marks;
    ReExam reexam;

    public Exam(int id, int marks) {
        this.id = id;
        this.marks = marks;
        this.reexam = new ReExam();
    }

    public Exam(Exam exam) {
        this.id = exam.id;
        this.marks = exam.marks;
        this.reexam = exam.reexam; // Shallow copy | HW - change this to deep copy
    }
}
