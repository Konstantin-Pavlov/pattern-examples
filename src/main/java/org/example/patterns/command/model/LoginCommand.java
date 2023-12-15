package org.example.patterns.command.model;

import org.example.patterns.command.interfaces.Command;

public class LoginCommand implements Command {
    @Override
    public void execute() {
        System.out.println("please enter number and pin");
    }
}
