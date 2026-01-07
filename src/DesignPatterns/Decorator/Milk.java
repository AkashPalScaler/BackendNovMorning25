package DesignPatterns.Decorator;

public class Milk extends AddOn {
    Integer cost = 20;
    Beverage base;

    public Milk(Beverage b) {
        if(b == null) throw new RuntimeException("Base beverage can't be null");
        this.base = b;
    }

    @Override
    Integer getCost() {
        return cost + this.base.getCost();
    }

    @Override
    String getDescription() {
        return this.base.getDescription() + " + a shot of milk";
    }
}
