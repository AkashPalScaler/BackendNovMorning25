package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Mocha();
        b = new Milk(b);
        b = new Milk(b);
        b = new Cream(b);

        Beverage c = new Cream(new Milk(new Milk(new Mocha())));

        System.out.println(b.getDescription());
        System.out.println("Cost  :" + b.getCost());
    }
}
// Homework : Write the function to identify basest beverage
//            Write the discount calculator based on addOns