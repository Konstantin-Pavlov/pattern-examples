package org.example.model;

import org.example.interfaces.Expression;

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
