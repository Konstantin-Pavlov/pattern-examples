package org.example.patterns.bridge;

public class TVRemoteControl extends RemoteControl {

    public TVRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);

    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Device is muted.");
    }
}