package DesignPatterns.Observer;

import java.util.List;

public class WeatherDataStore extends Publisher {
    Float temperature;
    Float precipitation;
    Integer AQI;

    public void updateTemperature(Float temperature, Float precipitation, Integer AQI) {
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.AQI = AQI;
        // update DB
        // notifySubs
        notifySubscribers();
    }

    public void notifySubscribers() {
        for(Observer o: observers){
            o.notify(this.temperature, this.precipitation, this.AQI);
        }
    }

    public void displayAllSubs(){
        for(Observer o: observers){
            o.display();
        }
    }
}
