package Factory;

import Factory.UIComponents.IOSUIFactory;

public class IOSFlutter implements Flutter{
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
        return new IOSUIFactory();
    }
}
