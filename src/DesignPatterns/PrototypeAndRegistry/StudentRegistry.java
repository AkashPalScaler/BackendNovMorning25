package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> register;

    public StudentRegistry() {
        this.register = new HashMap<>();
    }

    void register(String key, Student s){
        register.put(key, s);
    }

    Student get(String key){
        if(!register.containsKey(key)){
            throw new RuntimeException("Register doesn't have the key");
        }
        return register.get(key).copy();
    }
}
