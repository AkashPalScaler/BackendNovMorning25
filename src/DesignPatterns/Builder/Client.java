package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
//        StudentBuilder builder = new StudentBuilder();
//        builder.setName("Akash");
//        builder.setEmail("akash.pal@scaler.com");
//        builder.setAge(29);
//        builder.setBatch("NovMorning25");
//        builder.setPsp(12.3f);
//
//        Student s = new Student(builder);

//        StudentBuilder builder = Student.getBuilder();
////        builder.setName("Akash");
////        builder.setEmail("akash.pal@scaler.com");
////        builder.setAge(29);
////        builder.setBatch("NovMorning25");
////        builder.setPsp(12.3f);
////
////        Student s = new Student(builder);

        Student s = Student.getBuilder()
                .setName("Akash")
                .setEmail("akash.pal@scaler.com")
                .setAge(29)
                .setBatch("NovMorning25")
                .setPsp(12.3f)
                .build();
    }
}
