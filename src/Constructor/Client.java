package Constructor;


public class Client {
    String clientName;
    public static void main(String[] args) {
        Student s = new Student(); // default constructor???
//        s.name = "Akash";
//        s.age = 20; //private not accessible
        Student s1 = new Student("Sam", 20);
        System.out.println("Debug");


    }
}

// Java says - It will not provide default constructor
// if you have defined any constructor
