package org.example.patterns.abstractFactory.windows;


import org.example.patterns.abstractFactory.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a checkbox in Windows style.");
    }
}