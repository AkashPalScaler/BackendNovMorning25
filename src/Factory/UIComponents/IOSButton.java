package Factory.UIComponents;

public class IOSButton implements Button{
    @Override
    public void render() {
        System.out.println("IOS Button is rendered");
    }

    @Override
    public void click() {
        System.out.println("IOS Button click is triggered");
    }
}
