package DesignPatterns.Observer;

public interface Observer {
    public void notify(Float temperature, Float precipitation, Integer AQI);
    public void display();
}
