package org.example.patterns.command.model;

import org.example.patterns.command.interfaces.Command;

public class InfoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no funds available");
    }
}
