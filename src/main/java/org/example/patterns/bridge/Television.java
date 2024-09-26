package org.example.patterns.bridge;

public class Television implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Television is turned on.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Television is turned off.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Television volume set to " + volume);
    }

    @Override
    public boolean isEnabled() {
        return on;
    }
}
