package DesignPatterns.Factory;

import DesignPatterns.Factory.UIComponents.Button;
import DesignPatterns.Factory.UIComponents.Checkbox;
import DesignPatterns.Factory.UIComponents.Dropdown;

public interface UIFactory {
    Button createButton();
    Dropdown createDropdown();
    Checkbox createCheckbox();
}
