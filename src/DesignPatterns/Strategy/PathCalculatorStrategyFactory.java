package DesignPatterns.Strategy;

public class PathCalculatorStrategyFactory {
    static PathCalculatorStrategy getStrategy(String mode){
        if(mode == "car"){
            return new CarPathCalculator();
        }else if(mode == "bike"){
            return new BikePathCalculator();
        }else if(mode == "walk"){
            return new WalkPathCalculator();
        }else{
            throw new RuntimeException("Invalid mode");
        }
    }
}
