package org.example.operators;

import org.example.abstractClasses.Operator;
import org.example.interfaces.Expression;

public class Plus extends Operator {
    public Plus(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    @Override
    public int interpret(Expression context) {
        return getExpressionLeft().interpret(context) + getExpressionRight().interpret(context);
    }
}
