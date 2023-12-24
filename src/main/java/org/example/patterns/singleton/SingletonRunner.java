package org.example.patterns.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2); // Output: true (both instances are the same)
    }
}
