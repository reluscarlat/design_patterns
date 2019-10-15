package singleton;

// This singleton is thread safe.

public class Singleton2 {

    private static Singleton2 mySingleton = null;

    private Singleton2() {}

    private static synchronized Singleton2 getInstance() {
        if(mySingleton == null) {
            mySingleton = new Singleton2();
        }
        return mySingleton;
    }

}
