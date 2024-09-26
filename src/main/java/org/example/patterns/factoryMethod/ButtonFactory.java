package org.example.patterns.factoryMethod;


import org.example.patterns.abstractFactory.Button;
import org.example.patterns.abstractFactory.GUIFactory;
import org.example.patterns.abstractFactory.macOS.MacOSFactory;
import org.example.patterns.abstractFactory.windows.WindowsFactory;

public class ButtonFactory {

    public static void main(String[] args) {

        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        Button button = factory.createButton();
        button.render();

    }
}
