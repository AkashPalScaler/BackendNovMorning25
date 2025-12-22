package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button;
import DesignPatterns.Factory.UIComponents.Checkbox;
import DesignPatterns.Factory.UIComponents.Dropdown;

public class MyApp {
    Flutter flutter;

    public MyApp(Flutter flutter) {
        this.flutter = flutter;
    }

    public void renderFrontPage(){
        UIFactory uiFactory = flutter.createUIFactory();

        Button b = uiFactory.createButton();
        Checkbox c = uiFactory.createCheckbox();
        Dropdown d = uiFactory.createDropdown();

        b.loaded();
    }
}
