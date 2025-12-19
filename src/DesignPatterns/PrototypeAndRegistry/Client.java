package DesignPatterns.PrototypeAndRegistry;

public class Client {
    static StudentRegistry registry = new StudentRegistry();
    static void fillregistry(){
        Student s = new Student("Akash", 29, "akash@gmail");
        IntelliStudent is = new IntelliStudent("Rahul", 29, "rahul@gmail", 1000);
        registry.register("StudentPrototype", s);
        registry.register("IntelliStudentPrototype", is);


    }
    public static void main(String[] args) {
        fillregistry();
        Student scopy = registry.get("StudentPrototype");
        IntelliStudent iscopy = (IntelliStudent) registry.get("IntelliStudentPrototype");
        System.out.println("DEBUG");
    }
}
