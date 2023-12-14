package org.example.patterns.interpreter;

import org.example.patterns.interpreter.interfaces.Expression;

//todo: работает только и однозначными числами
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


