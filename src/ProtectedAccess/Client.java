package ProtectedAccess;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sam";
//        s.age = 12;
        s.setAge(20);
//        s.email = "akash"; // Default only accessible inside a package
//        s.number = "123102387"; // I can access protected(outside of package) but only inside the child class
       s.getNumber(); // Protected - outside of package can be accessed only inside child
        System.out.println("DEBUG");
    }
}
