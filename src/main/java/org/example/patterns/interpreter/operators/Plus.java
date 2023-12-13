package org.example.patterns.interpreter.operators;

import org.example.patterns.interpreter.abstractClasses.Operator;
import org.example.patterns.interpreter.interfaces.Expression;

public class Plus extends Operator {
    public Plus(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    @Override
    public int interpret(Expression context) {
        return getExpressionLeft().interpret(context) + getExpressionRight().interpret(context);
    }
}
