package DesignPatterns.PrototypeAndRegistry;

public class IntelliStudent extends Student{
    int iq;

    public IntelliStudent(String name, int age, String email, int iq) {
        super(name, age, email);
        this.iq = iq;
    }

    public IntelliStudent(IntelliStudent is){
        this.name = is.name;
        this.age = is.age;
        this.email = is.email;
        this.iq = is.iq;
    }

    @Override
    public IntelliStudent copy(){
        return new IntelliStudent(this);
    }
}
