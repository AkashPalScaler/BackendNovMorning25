package DesignPatterns.Factory;

public class IOSFlutter implements Flutter {
    @Override
    public void setTheme() {
        System.out.println("Set IOS theme");
    }

    @Override
    public void setRefreshRate() {
        System.out.println("Set IOS refresh rate");
    }

    @Override
    public UIFactory createUIFactory() {
        return new IOSUIFactory();
    }
}
