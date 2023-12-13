package org.example.patterns.interpreter.interfaces;

public interface Expression {
    int interpret(Expression context);
}
