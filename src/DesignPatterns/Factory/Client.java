package DesignPatterns.Factory;

public class Client {
    public static void main(String[] args) {
        // Config : Platform=Android/IOS -> String Type
        String platform = "IOS";
        Flutter f = FlutterFactory.getFlutter(platform);
        MyApp myApp = new MyApp(f);
        myApp.renderFrontPage();
    }
}
