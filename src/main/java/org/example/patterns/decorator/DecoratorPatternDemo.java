package org.example.patterns.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Message message = new SimpleMessage("Hello World");

        Message decoratedMessage = new PrefixMessageDecorator(
                new UpperCaseMessageDecorator(message), "Greeting:"
        );

        System.out.println(decoratedMessage.getContent());
    }
}