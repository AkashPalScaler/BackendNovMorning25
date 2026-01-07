package DesignPatterns.Decorator;

public class Cream extends AddOn{
    Integer cost = 30;
    Beverage base;

    public Cream(Beverage b) {
        if(b == null) throw new RuntimeException("Base beverage can't be null");
        this.base = b;
    }
    @Override
    Integer getCost() {
        return cost + this.base.getCost();
    }

    @Override
    String getDescription() {
        return this.base.getDescription() + " + a shot of cream";
    }
}
