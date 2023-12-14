package org.example.patterns.mediator;

import org.example.patterns.mediator.models.ConcreateColleague;
import org.example.patterns.mediator.models.ConcreateMediator;

import java.util.Arrays;

public class MediatorRunner {
    public static void main(String[] args) {
        ConcreateMediator concreateMediator = new ConcreateMediator();

        ConcreateColleague[] colleagues = new ConcreateColleague[]{
                new ConcreateColleague(concreateMediator, "Tim"),
                new ConcreateColleague(concreateMediator, "Tom"),
                new ConcreateColleague(concreateMediator, "Jim")
        };

        Arrays.stream(colleagues).forEach(concreateMediator::add);


        colleagues[0].setTrue();
        colleagues[2].setTrue();

        System.out.println();

        for (ConcreateColleague colleague : colleagues) {
            colleague.showStatus();
        }

        System.out.println();

        colleagues[1].changeStatus();
    }
}
