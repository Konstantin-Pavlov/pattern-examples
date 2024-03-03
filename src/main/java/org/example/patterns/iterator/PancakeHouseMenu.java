package org.example.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        addItem("big breakfast", "pancakes with scrambled eggs and toast", true, 299);
        addItem("standard pancake breakfast", "pancakes with fried eggs and toast", false, 199);
    }


    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
