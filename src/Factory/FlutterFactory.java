package Factory;

public class FlutterFactory {
    static Flutter getFlutter(String platform){
        if(platform == "Android"){
            return new AndroidFlutter();
        } else if (platform == "IOS") {
            return  new IOSFlutter();
        }else{
            throw new RuntimeException("Invalid platform");
        }
    }
}
