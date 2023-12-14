package org.example.patterns.state.trucks.model;

public class Driver {
    private String id;
    private String name;
    private boolean isAvailable;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
        if (available) {
            System.out.printf("водитель %s теперь свободен%n", this.getName());
        } else {
            System.out.printf("водитель %s теперь за рулем%n", this.getName());
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
