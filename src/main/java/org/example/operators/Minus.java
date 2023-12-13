package org.example.operators;

import org.example.abstractClasses.Operator;
import org.example.interfaces.Expression;

public class Minus extends Operator {
    public Minus(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    @Override
    public int interpret(Expression context) {
        return getExpressionLeft().interpret(context) - getExpressionRight().interpret(context);
    }
}
