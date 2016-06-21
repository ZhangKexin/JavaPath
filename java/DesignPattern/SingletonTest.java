package DesignPattern;

/**
 * Created by zkx on 2015/8/27.
 */
public class SingletonTest {
    public static void main(String[] args) {

    }


}

class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonThread {
    private SingletonThread instance = null;

    private SingletonThread() {
    }

    public synchronized SingletonThread getInstance() {
        if (instance == null) {
            instance = new SingletonThread();
        }
        return instance;
    }
}