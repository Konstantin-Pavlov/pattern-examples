package org.example.patterns.abstractFactory.macOS;

import org.example.patterns.abstractFactory.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a checkbox in macOS style.");
    }
}
