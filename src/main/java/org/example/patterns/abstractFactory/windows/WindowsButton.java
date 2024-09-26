package org.example.patterns.abstractFactory.windows;


import org.example.patterns.abstractFactory.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a button in Windows style.");
    }
}
