package org.example.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developerList = new ArrayList<>();

        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));

        for (Developer developer : developerList) {
            developer.writeCode();
        }

    }
}
