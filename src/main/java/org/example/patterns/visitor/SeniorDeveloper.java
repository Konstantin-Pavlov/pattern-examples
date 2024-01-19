package org.example.patterns.visitor;

public class SeniorDeveloper implements Ideveloper{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("исправляет классы после Джуна");
    }

    @Override
    public void create(Test test) {
        System.out.println("пишет функциональные интеграционные и модульные тесты");
    }

    @Override
    public void create(Database database) {
        System.out.println("восстанавливает базу после Джуна из дампа");
    }
}
