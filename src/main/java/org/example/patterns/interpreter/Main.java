package org.example.patterns.interpreter;

import org.example.patterns.interpreter.interfaces.Expression;

// move to another package; add other patterns to this project
// now it's the test branch
public class Main {
    public static void main(String[] args) {
        String expression = "1+2+3-4"; // 2
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interpret(evaluator));
        // how to handle whitespaces etc
//        String reversed = new StringBuilder(expression).reverse().toString();
//        for (String s : reversed.split("\\d+\\s*")) { // \\d -> any symbol thar is not digit (so only digits remain in reversed.split)
//            System.out.println(s);
//        }

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
