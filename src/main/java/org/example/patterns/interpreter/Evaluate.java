package org.example.patterns.interpreter;

import org.example.patterns.interpreter.interfaces.Expression;
import org.example.patterns.interpreter.model.Number;
import org.example.patterns.interpreter.operators.Minus;
import org.example.patterns.interpreter.operators.Plus;

import java.util.Stack;

public class Evaluate implements Expression {
    private final Expression evaluate;

    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        String reversed = new StringBuilder(expression).reverse().toString();
        for (String number : reversed.split("\\D")) { // \\D -> any symbol thar is not digit (so only digits remain in reversed.split)
            expressions.push(new Number(Integer.parseInt(number)));
        }
        for (String operator : expression.split("\\d+")) { // \\d -> any symbol thar is digit (so only operators (+-) remain in reversed.split)
            if (operator.equals("+")) {
                expressions.push(new Plus(expressions.pop(), expressions.pop()));
            } else if (operator.equals("-")) {
                expressions.push(new Minus(expressions.pop(), expressions.pop()));
            }
        }

        evaluate = expressions.pop();
    }


    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }
}
