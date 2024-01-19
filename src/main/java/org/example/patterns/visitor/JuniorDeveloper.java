package org.example.patterns.visitor;

public class JuniorDeveloper implements Ideveloper {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("пишет корявый код без использования паттернов");
    }

    @Override
    public void create(Test test) {
        System.out.println("пишет нерабочие тесты");
    }

    @Override
    public void create(Database database) {
        System.out.println("роняет прод  - drop database");
    }
}
