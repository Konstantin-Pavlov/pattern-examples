package org.example.patterns.iterator;

public class DinerMenu {
    private final static int MAX_ITEMS = 3;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("can't add item");
        } else {
            menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
