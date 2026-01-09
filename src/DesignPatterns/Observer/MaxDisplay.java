package DesignPatterns.Observer;

public class MaxDisplay implements Observer{
    Float maxTemp = Float.MIN_VALUE;
    Float maxPrec =  Float.MIN_VALUE;
    Integer maxAQI = Integer.MIN_VALUE;
    @Override
    public void notify(Float temperature, Float precipitation, Integer AQI) {
        System.out.println("Max display is notified");
        maxTemp = Math.max(maxTemp, temperature);
        maxPrec = Math.max(maxPrec, precipitation);
        maxAQI = Math.max(maxAQI, AQI);
    }

    public void display(){
        System.out.println("***** Max Display *****");
        System.out.println("Max temp is " + maxTemp);
        System.out.println("Max prec is " + maxPrec);
        System.out.println("Max AQI is " + maxAQI);
    }
}
