package org.example.patterns.abstractFactory;

import org.example.patterns.abstractFactory.macOS.MacOSFactory;
import org.example.patterns.abstractFactory.windows.WindowsFactory;

public class Main {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}
