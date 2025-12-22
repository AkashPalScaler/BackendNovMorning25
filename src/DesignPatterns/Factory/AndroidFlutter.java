package DesignPatterns.Factory;

public class AndroidFlutter implements Flutter{
    @Override
    public void setTheme() {
        System.out.println("Setting android theme");
    }

    @Override
    public void setRefreshRate() {
        System.out.println("Setting android refresh rate");
    }

    @Override
    public UIFactory createUIFactory() {
        return new AndroidUIFactory();
    }
}
