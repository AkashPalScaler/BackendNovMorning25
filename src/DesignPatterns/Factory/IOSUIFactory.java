package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button;
import DesignPatterns.Factory.UIComponents.Checkbox;
import DesignPatterns.Factory.UIComponents.Dropdown;
import DesignPatterns.Factory.UIComponents.IOSUIComponents.IOSButton;
import DesignPatterns.Factory.UIComponents.IOSUIComponents.IOSCheckbox;
import DesignPatterns.Factory.UIComponents.IOSUIComponents.IOSDropdown;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Checkbox createCheckbox() {
        return new IOSCheckbox();
    }
}
