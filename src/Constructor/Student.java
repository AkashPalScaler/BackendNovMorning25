package Constructor;

public class Student {
    public String name;
    private int age;

    public Student(){
        name="Default";
        age=100;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//    void doSomething(){
//        age = 20;
//    }

}
