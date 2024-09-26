package org.example.patterns.abstractFactory.macOS;


import org.example.patterns.abstractFactory.Button;
import org.example.patterns.abstractFactory.Checkbox;
import org.example.patterns.abstractFactory.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}