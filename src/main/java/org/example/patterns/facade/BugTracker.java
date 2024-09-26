package org.example.patterns.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    private void endSprint(){
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
