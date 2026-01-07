package Factory.UIComponents;

import Factory.UIFactory;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new IOSCheckbox();
    }

    @Override
    public Div createDiv() {
        return new IOSDiv();
    }
}
