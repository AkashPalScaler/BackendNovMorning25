package Factory;

public class MyApp {
    public static void main(String[] args) {
        //String platform = ENV_VARIABLE or Fetch from OS
        String platform  = "Android";
        HomePage homePage = new HomePage(FlutterFactory.getFlutter(platform));
        homePage.render();
    }
}
