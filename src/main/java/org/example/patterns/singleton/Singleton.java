package org.example.patterns.singleton;

/**
 * the Singleton class has a private constructor to prevent direct instantiation from outside the class.
 * The getInstance() method is used to access the single instance of the class.
 * <p>
 * The getInstance() method uses double-checked locking to ensure thread-safety and lazy initialization.
 * It checks if the instance is null, and if so, it enters a synchronized block to prevent multiple threads
 * from creating multiple instances simultaneously. Inside the synchronized block,
 * it checks again if the instance is null before creating a new instance.
 * <p>
 * This implementation ensures that only one instance of the Singleton class is created and returned,
 * regardless of how many times getInstance() is called.
 */

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

