package DesignPatterns.Factory;

public class FlutterFactory {
    static Flutter getFlutter(String platform){
        if (platform == "IOS") {
            return new IOSFlutter();
        }else if(platform == "Android"){
            return new AndroidFlutter();
        }
        else{
            throw new RuntimeException("Platform doesn't exist");
        }
    }
}
