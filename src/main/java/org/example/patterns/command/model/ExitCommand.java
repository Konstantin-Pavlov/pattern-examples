package org.example.patterns.command.model;

import org.example.patterns.command.interfaces.Command;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Goodbye");
    }
}
