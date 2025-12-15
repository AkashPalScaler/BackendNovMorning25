package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance("localhost:4000", "akash", "password");
        DBConnection db2 = DBConnection.getInstance("localhost:4000", "akash", "password");
        DBConnection db3 = DBConnection.getInstance("localhost:4000", "akash", "password");
        DBConnection db4 = DBConnection.getInstance("localhost:4000", "akash", "password");
        System.out.println("DEBUG");
    }
}

// Simulate this object creation in multiple threads (100 threads)
