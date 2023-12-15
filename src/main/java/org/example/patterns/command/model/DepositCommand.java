package org.example.patterns.command.model;

import org.example.patterns.command.interfaces.Command;

public class DepositCommand implements Command {
    @Override
    public void execute() {
        System.out.println("you have deposited $100");
    }
}
