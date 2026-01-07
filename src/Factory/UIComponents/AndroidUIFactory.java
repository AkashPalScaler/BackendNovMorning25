package Factory.UIComponents;

import Factory.UIFactory;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }

    @Override
    public Div createDiv() {
        return new AndroidDiv();
    }
}
