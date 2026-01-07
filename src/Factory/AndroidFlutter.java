package Factory;

import Factory.UIComponents.AndroidUIFactory;

public class AndroidFlutter implements Flutter{
    @Override
    public void setTheme() {

    }

    @Override
    public void refreshRate() {

    }

    @Override
    public void DOMUpdate() {

    }

    @Override
    public UIFactory createUIFactory() {
        return new AndroidUIFactory();
    }
}
