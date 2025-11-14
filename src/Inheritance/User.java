package Inheritance;

public class User {
    public String name;
    private int age;
    protected String number;
    String email;

    public User() {
        System.out.println("User constructor");
    }

    public User(String name) {
        this.name = name;
        System.out.println("Parameterised User constructor");
    }

    int getAge(){
        return age;
    }

    public void setAge(int age) {
        //Go through this function - single point
        // Validations
        this.age = age;
    }
}
