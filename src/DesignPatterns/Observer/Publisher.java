package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    List<Observer> observers;

    public Publisher() {
        this.observers = new ArrayList<>();
    }

    abstract void notifySubscribers();
//    abstract void subscribe(Observer observer);
//    abstract void unsubscribe(Observer observer);

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void unsubscribeAll(){
        observers.clear();
    }
}
