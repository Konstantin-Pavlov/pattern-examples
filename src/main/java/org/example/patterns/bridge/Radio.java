package org.example.patterns.bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 20;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is turned on.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is turned off.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + volume);
    }

    @Override
    public boolean isEnabled() {
        return on;
    }
}