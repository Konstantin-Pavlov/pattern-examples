package org.example.patterns.command.control;

import org.example.patterns.command.enums.Operation;
import org.example.patterns.command.interfaces.Command;
import org.example.patterns.command.model.*;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private static final Map<Operation, Command> commandsMap;

    private CommandExecutor() {
    }

    static {
        commandsMap = Map.of(
                Operation.LOGIN,    new LoginCommand(),
                Operation.DEPOSIT,  new DepositCommand(),
                Operation.INFO,     new InfoCommand(),
                Operation.WITHDRAW, new WithdrawCommand(),
                Operation.EXIT,     new ExitCommand());
    }

    public static void execute(Operation operation) {
        commandsMap.get(operation).execute();
    }
}
