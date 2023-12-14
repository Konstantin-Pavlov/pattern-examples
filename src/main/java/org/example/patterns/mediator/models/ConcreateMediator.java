package org.example.patterns.mediator.models;

import org.example.patterns.mediator.interfaces.Colleague;
import org.example.patterns.mediator.interfaces.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreateMediator implements Mediator {
    List<Colleague> colleagues = new ArrayList<>();

    public void add(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void requestAll(Colleague colleague) {
        colleague.setTrue();
        colleagues.stream().filter(clg -> !clg.equals(colleague)).forEach(Colleague::setFalse);
    }
}
