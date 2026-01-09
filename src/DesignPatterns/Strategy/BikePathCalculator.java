package DesignPatterns.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String src, String dst) {
        System.out.println("Calculating path by bike");
    }
}
