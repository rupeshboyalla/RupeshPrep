package DesignPatterns;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rupeshkb on 8/23/17.
 */
public class Singleton {
    public static Singleton singleton = null;
    private Singleton(){
        if(singleton !=null){
            throw new RuntimeException("can't create instance, use getInstance()");
        }
        System.out.println("Printing .....");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

class TestClass{

    public static void main(String[] args) throws Exception{
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        print("s1", s1);
        print("s2", s2);

        // Reflection
        Class c = Class.forName("DesignPatterns.Singleton");
        Constructor<Singleton> constructor = c.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s3 = constructor.newInstance();
        print("s3", s3);
    }

    public static  void print(String s, Singleton object){
        System.out.println(String.format("Object: %s , Hashcode: %d", s, object.hashCode()));
    }





}
