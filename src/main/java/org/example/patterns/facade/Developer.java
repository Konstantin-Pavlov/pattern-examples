package org.example.patterns.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()){
            System.out.println("developer is  working");
        }else
            System.out.println("developer is dead");
    }
}
