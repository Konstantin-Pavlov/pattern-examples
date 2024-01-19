package org.example.patterns.visitor;

public class Test implements IProjectElement{
    @Override
    public void beWritten(Ideveloper developer) {
        developer.create(this);
    }
}
