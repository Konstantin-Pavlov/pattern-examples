package org.example.patterns.mediator.models;

import org.example.patterns.mediator.interfaces.Colleague;
import org.example.patterns.mediator.interfaces.Mediator;

public class ConcreateColleague implements Colleague {

    private boolean status;
    private final Mediator mediator;
    private final String name;
    private final String fmt;

    public ConcreateColleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.fmt = "%s status is %s%n";
    }

    @Override
    public void setTrue() {
        this.status = true;
        printMessage();
    }

    @Override
    public void setFalse() {
        this.status = false;
        printMessage();
    }

    public void showStatus() {
        printMessage();
    }

    private void printMessage() {
        System.out.printf(this.fmt, this.name, this.status);
    }

    @Override
    public void changeStatus() {
        this.mediator.requestAll(this);
    }
}
