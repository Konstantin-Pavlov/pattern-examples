package org.example.patterns.iterator;

public class DinerMenu {
    private final static int MAX_ITEMS = 3;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem("vegetarian blt (beacon, lettuce, tomato)", "soy bacon with lettuce and tomatoes on whole grain bread", true, 299);
        addItem("BLT", "bacon with lettuce and tomatoes on whole grain bread", false, 199);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("can't add item");
        } else {
            menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}
