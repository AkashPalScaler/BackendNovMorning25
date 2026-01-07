package Factory;

import Factory.UIComponents.Button;
import Factory.UIComponents.Checkbox;
import Factory.UIComponents.Div;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
    Div createDiv();
}
