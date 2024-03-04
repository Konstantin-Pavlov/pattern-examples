package org.example.patterns.iterator;

public class MenuLauncher {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waiter waiter = new Waiter(pancakeHouseMenu, dinerMenu);
        waiter.printMenu();
    }
}
