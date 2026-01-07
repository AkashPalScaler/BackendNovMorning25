package Factory.UIComponents;

public class AndroidButton implements Button{
    @Override
    public void render() {
        System.out.println("Android button is rendered");
    }

    @Override
    public void click() {
        System.out.println("Android button click triggered");
    }
}
