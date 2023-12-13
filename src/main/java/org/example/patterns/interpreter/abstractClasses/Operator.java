package org.example.patterns.interpreter.abstractClasses;

import org.example.patterns.interpreter.interfaces.Expression;

public abstract class Operator implements Expression {
    Expression expressionLeft;
    Expression expressionRight;

    public Operator(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    public Expression getExpressionLeft() {
        return expressionLeft;
    }

    public Expression getExpressionRight() {
        return expressionRight;
    }
}
