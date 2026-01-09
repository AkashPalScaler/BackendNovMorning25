package DesignPatterns.Observer;

import java.util.List;

public class WeatherStation2 {
    static WeatherDataStore dataStore = new WeatherDataStore();

    static void updateObserverList(List<String> subscriberNames){
        dataStore.unsubscribeAll();
        for(String oname : subscriberNames){
            dataStore.subscribe(ObserverFactory.getObserver(oname));
        }
    }

    public static void main(String[] args) {

        updateObserverList(List.of("maxDisplay"));
        dataStore.updateTemperature(100f, 89f, 320);
        dataStore.updateTemperature(105f, 78f, 300);

        dataStore.displayAllSubs();
        updateObserverList(List.of("maxDisplay", "avgDisplay"));
        dataStore.updateTemperature(103f, 80f, 200);
        dataStore.updateTemperature(90f, 70f, 250);

        dataStore.displayAllSubs();

        updateObserverList(List.of("avgDisplay"));

        dataStore.updateTemperature(103f, 80f, 200);
        dataStore.displayAllSubs();
    }
}
