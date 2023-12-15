package org.example.patterns.command.model;

import org.example.patterns.command.interfaces.Command;

public class WithdrawCommand implements Command {
    @Override
    public void execute() {
        System.out.println("you have withdrawn $100");
    }
}
