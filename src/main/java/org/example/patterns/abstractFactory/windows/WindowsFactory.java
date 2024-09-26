package org.example.patterns.abstractFactory.windows;


import org.example.patterns.abstractFactory.Button;
import org.example.patterns.abstractFactory.Checkbox;
import org.example.patterns.abstractFactory.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}