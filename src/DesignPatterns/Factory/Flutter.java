package DesignPatterns.Factory;

public interface Flutter {
    void setTheme();
    void setRefreshRate();
    UIFactory createUIFactory();
}
