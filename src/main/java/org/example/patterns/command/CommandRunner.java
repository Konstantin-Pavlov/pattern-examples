package org.example.patterns.command;

import org.example.patterns.command.control.CommandExecutor;
import org.example.patterns.command.enums.Operation;

import java.util.Scanner;

public class CommandRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation operation = null;
        while (operation != Operation.EXIT) {
            System.out.print("write the command: login, info, deposit, withdraw, exit: ");
            operation = Operation.valueOf(scanner.nextLine().strip().toUpperCase());
            CommandExecutor.execute(operation);
        }
        scanner.close();
    }
}
