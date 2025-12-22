package DesignPatterns.Factory.UIComponents.AndroidUICompoonents;

import DesignPatterns.Factory.UIComponents.Button;

public class AndroidButton implements Button {
    @Override
    public void loaded() {
        System.out.println("Android Button is rendered");
    }
}
