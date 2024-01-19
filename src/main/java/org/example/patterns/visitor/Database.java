package org.example.patterns.visitor;

public class Database implements IProjectElement{
    @Override
    public void beWritten(Ideveloper developer) {
        developer.create(this);
    }
}
