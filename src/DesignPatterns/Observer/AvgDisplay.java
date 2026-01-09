package DesignPatterns.Observer;

public class AvgDisplay implements Observer{
    Float avgTemp = 0.0f;
    Float avgPrec = 0.0f;
    Integer avgAQI = 0;
    @Override
    public void notify(Float temperature, Float precipitation, Integer AQI) {
        System.out.println("Avg display is notified");
        avgTemp += temperature;
        avgTemp /= 2;
        avgPrec += precipitation;
        avgPrec /= 2;
        avgAQI += AQI;
        avgAQI /= 2;
    }

    @Override
    public void display() {
        System.out.println("***** Avg Display *****");
        System.out.println("Avg temp is " + avgTemp);
        System.out.println("Avg prec is " + avgPrec);
        System.out.println("Avg AQI is " + avgAQI);
    }
}
