package DesignPatterns.Observer;

public class WeatherStation {
    static WeatherDataStore dataStore = new WeatherDataStore();
    static Observer maxDisplay = new MaxDisplay();
    static Observer avgDisplay = new AvgDisplay();
    public static void main(String[] args) {

        dataStore.subscribe(maxDisplay);
        dataStore.updateTemperature(100f, 89f, 320);
        dataStore.updateTemperature(105f, 78f, 300);

        dataStore.displayAllSubs();

        dataStore.subscribe(avgDisplay);
        dataStore.updateTemperature(103f, 80f, 200);
        dataStore.updateTemperature(90f, 70f, 250);

        dataStore.displayAllSubs();

        dataStore.unsubscribe(maxDisplay);

        dataStore.updateTemperature(103f, 80f, 200);
        dataStore.displayAllSubs();
    }
    // List of Displays("maxDisplay", "avgDisplay")
}
