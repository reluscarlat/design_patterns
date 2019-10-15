package singleton;

// This singleton is not thread safe.

public class Singleton1 {
    private static Singleton1 mySingelto = null;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if(mySingelto == null) {
            mySingelto = new Singleton1();
        }
        return mySingelto;
    }
}
