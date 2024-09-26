package org.example.patterns.strategy;


import org.example.patterns.state.developer.Coding;
import org.example.patterns.state.developer.Reading;
import org.example.patterns.state.developer.Sleeping;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();
    }
}
