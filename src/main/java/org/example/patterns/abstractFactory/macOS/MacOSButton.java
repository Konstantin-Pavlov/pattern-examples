package org.example.patterns.abstractFactory.macOS;

import org.example.patterns.abstractFactory.Button;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a button in macOS style.");
    }
}