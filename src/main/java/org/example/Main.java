package org.example;

public class Main {
    public static void main(String[] args) {
        String expression = "1+2+3-4"; // 2


    }
}

class Cat {
    private int stamina = 1000;
    private String name;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        this.stamina -= 100;
    }

    public void eat() {
        this.stamina += 200;
    }

    public void sleep() {
        this.stamina += 100;
    }
}
