package DesignPatterns.Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String src, String dst) {
        System.out.println("Calculating path by walk");
    }
}
