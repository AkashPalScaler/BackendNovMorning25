package DesignPatterns.PrototypeAndRegistry;

public class Student {
    String name;
    int age;
    String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.email = s.email;
    }

    public Student() {
    }

    public Student copy(){
        return new Student(this);
    }
}
