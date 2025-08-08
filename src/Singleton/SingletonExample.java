package Singleton;

public class SingletonExample {
    private SingletonExample(){

    }
    private static SingletonExample instance;

    public static SingletonExample getInstance() {
        // check whether 1 obj only is created or not
        if(instance==null){
            instance = new SingletonExample();
        }
        return instance;
    }
}
