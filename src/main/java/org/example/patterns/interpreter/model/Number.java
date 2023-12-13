package org.example.patterns.interpreter.model;

import org.example.patterns.interpreter.interfaces.Expression;

public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Expression context) {
        return this.number;
    }
}
