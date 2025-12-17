package DesignPatterns.Builder;

public class Student {
    private String name;
    private String email;
    private Integer age;
    private Float psp;
    private String batch;
    private String studentStatus;

    //This is function to get the builder class
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    private Student( StudentBuilder builder) {
        // All validations
        if(builder.email == null ) throw new RuntimeException("Email can't be null");
        if(builder.age < 18) throw new RuntimeException("Student must be an adult");
        // ...many more validations

        // Initialization
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.psp = builder.psp;
        this.batch = builder.batch;
        this.studentStatus = "Enrolled"; // Default value always during object creation
    }

    // Inner class
    public static class StudentBuilder {
        String name;
        String email;
        Integer age;
        Float psp;
        String batch;

        private StudentBuilder(){

        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public StudentBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Float getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(Float psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Student build(){
            // All validations
            if(this.email == null ) throw new RuntimeException("Email can't be null");
            if(this.age < 18) throw new RuntimeException("Student must be an adult");
            // ...many more validations

            return new Student(this);
        }
    }
}
