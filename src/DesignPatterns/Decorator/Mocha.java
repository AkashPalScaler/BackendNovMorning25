package DesignPatterns.Decorator;

public class Mocha extends Beverage{
    Integer cost = 150;
    @Override
    Integer getCost() {
        return cost;
    }

    @Override
    String getDescription() {
        return "Classic Mocha";
    }
}
