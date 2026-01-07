package DesignPatterns.Decorator;

public class HouseBlend extends Beverage{
    Integer cost = 100; // Fetched from DB or env vars
    @Override
    Integer getCost() {
        return cost;
    }

    @Override
    String getDescription() {
        return "House special coffee blend";
    }
}
