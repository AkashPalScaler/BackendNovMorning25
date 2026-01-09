package DesignPatterns.Observer;

public class ObserverFactory {
    static Observer getObserver(String observerName){
        if(observerName == "maxDisplay"){
            return new MaxDisplay();
        }else if(observerName == "avgDisplay"){
            return  new AvgDisplay();
        }else{
            throw new RuntimeException("Invalid Observer name");
        }
    }
}
