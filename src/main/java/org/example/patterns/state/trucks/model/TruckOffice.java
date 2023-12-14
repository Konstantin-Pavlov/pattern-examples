package org.example.patterns.state.trucks.model;

import exceptions.CustomException;
import org.example.patterns.state.trucks.interfaces.Office;

import java.util.Scanner;

public class TruckOffice implements Office {

    @Override
    public void run(Truck[] trucks, Driver[] drivers) {
        UserInputHandler inputHandler = new UserInputHandler();
        Truck selectedTruck;
        selectedTruck = getTruckInfo(inputHandler, trucks);

        changeTruckState(inputHandler, selectedTruck);
        printDrivers(drivers);
        printTrucks(trucks);
        printTrucksAndDrivers(trucks);

        inputHandler.closeUserInput();
    }

    private Truck getTruckInfo(UserInputHandler inputHandler, Truck[] trucks) {
        int userInput;
        System.out.print("enter the truck id (1-3) to see info and change its state: ");
        userInput = inputHandler.getAndCheckUserInput();
        Truck truck = trucks[userInput - 1];
        System.out.println(truck);
        drawLine('#', 75);
        return truck;
    }

    private void changeTruckState(UserInputHandler inputHandler, Truck truck) {
        int actionNumber;
        System.out.println("truck state changing program");
        System.out.println("enter the action number (1-3) to change the truck state");
        System.out.print("""
                        1 change driver
                        2 send on route
                        3 Send for repair
                """);
        actionNumber = inputHandler.getAndCheckUserInput();
        switch (actionNumber) {
            case 1:
                truck.changeDriver();
                break;
            case 2:
                truck.startDriving();
                break;
            case 3:
                truck.startRepair();
                break;
            default:
                System.out.println("impossible case");
        }
        System.out.println();
        drawLine('#', 75);
    }

    private void printTrucksAndDrivers(Truck[] trucks) {
        System.out.println("информация о том какой водитель ведет какой грузовик");
        for (Truck truck : trucks) {
            System.out.printf("грузовик %s ведёт водитель %s%n", truck.getTruckBrand(), truck.getDriver().getName());
        }
        System.out.println();
        drawLine('#', 75);
    }

    private void printTrucks(Truck[] trucks) {
        System.out.println("таблица грузовиков");
        String fmt = "%-2s | %-15s | %-10s | %-8s%n";
        System.out.printf(fmt, "#", "truck", "driver", "state");
        drawLine('-', 50);
        for (Truck truck : trucks) {
            System.out.printf(fmt, truck.getId(), truck.getTruckBrand(), truck.getDriverName(), truck.getTruckLocation());
        }
        System.out.println();
        drawLine('#', 75);
    }

    private void printDrivers(Driver[] drivers) {
        System.out.println("таблица водителей");
        String fmt = "%-4s | %-10s | %-5s%n";
        System.out.printf(fmt, "#", "driver", "bus");
        drawLine('-', 50);
        for (Driver driver : drivers) {
            System.out.printf(fmt, driver.getId(), driver.getName(), "");
        }
        System.out.println();
        drawLine('#', 75);
    }

    private void drawLine(char fillCharacter, int times) {
        System.out.println(String.valueOf(fillCharacter).repeat(times));
//        System.out.println();
    }
}

class UserInputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public int getAndCheckUserInput() {
        int input;
        while (true) {
            try {
                input = checkUserInput(scanner.nextLine());
            } catch (CustomException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.print("Try again: ");
                continue;
            }
            break;
        }
        return input;

    }

    private int checkUserInput(String strInput) throws CustomException, NumberFormatException {
        int intInput = 0;
        if (strInput.isBlank() || strInput.isEmpty()) {
            throw new CustomException("empty input");
        }
        try {
            intInput = Integer.parseInt(strInput);
        } catch (NumberFormatException e) {
            throw new CustomException("you should enter a number");
        }
        if (intInput < 1 || intInput > 3) {
            throw new CustomException("you should enter a number for 1 to 3");
        }
        return intInput;
    }

    public void closeUserInput() {
        scanner.close();
    }
}
