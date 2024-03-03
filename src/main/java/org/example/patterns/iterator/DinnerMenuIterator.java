package org.example.patterns.iterator;

public class DinnerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
