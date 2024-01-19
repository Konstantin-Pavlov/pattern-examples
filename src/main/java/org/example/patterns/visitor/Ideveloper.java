package org.example.patterns.visitor;

public interface Ideveloper {
    public void create(ProjectClass projectClass);
    public void create(Test test);
    public void create(Database database);
}
