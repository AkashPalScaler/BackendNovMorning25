package DesignPatterns.Factory.UIComponents.IOSUIComponents;

import DesignPatterns.Factory.UIComponents.Button;

public class IOSButton implements Button {
    @Override
    public void loaded() {
        System.out.println("IOS Button is rendered");
    }
}
