package DesignPatterns.Strategy;

public class GoogleMaps {
    void findPath(String src, String dst, String mode){
        PathCalculatorStrategy pc = PathCalculatorStrategyFactory.getStrategy(mode);
        pc.findPath(src, dst);
    }
}
// Break till 7:45