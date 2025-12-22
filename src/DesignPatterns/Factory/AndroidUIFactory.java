package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.AndroidUICompoonents.AndroidButton;
import DesignPatterns.Factory.UIComponents.AndroidUICompoonents.AndroidCheckbox;
import DesignPatterns.Factory.UIComponents.AndroidUICompoonents.AndroidDropdown;
import DesignPatterns.Factory.UIComponents.Button;
import DesignPatterns.Factory.UIComponents.Checkbox;
import DesignPatterns.Factory.UIComponents.Dropdown;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }
}
