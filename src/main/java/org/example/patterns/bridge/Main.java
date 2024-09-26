package org.example.patterns.bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new Television();
        TVRemoteControl advancedRemote = new TVRemoteControl(tv);
        advancedRemote.togglePower();
        advancedRemote.setVolume(30);
        advancedRemote.mute();
    }
}
