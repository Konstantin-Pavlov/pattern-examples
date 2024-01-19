package org.example.patterns.visitor;

public class ProjectClass implements IProjectElement{
    @Override
    public void beWritten(Ideveloper developer) {
        developer.create(this);
    }
}
