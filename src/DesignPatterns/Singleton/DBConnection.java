package DesignPatterns.Singleton;

public class DBConnection {
    String url;
    String username;
    String password;

    private static DBConnection instance = null;

    private DBConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    static DBConnection getInstance(String url, String username, String password){
        if(instance == null){
            synchronized (DBConnection.class){
                if(instance == null){
                    instance = new DBConnection(url, username, password);
                }
            }
        }
        return instance;
    }
}
