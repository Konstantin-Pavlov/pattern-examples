package org.example.patterns.iterator;

public class Waiter {
    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinerMenu dinerMenu;

    public Waiter(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("Breakfast menu");
        printMenu(pancakeHouseMenuIterator);

        System.out.println("*".repeat(42) + "\n");

        System.out.println("Lunch menu");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem item = iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
            System.out.println(item.isVegetarian() ? "Vegetarian" : "Not Vegetarian");
            System.out.println();
        }
    }
}
