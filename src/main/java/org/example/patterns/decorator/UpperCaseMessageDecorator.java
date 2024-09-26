package org.example.patterns.decorator;

class UpperCaseMessageDecorator extends MessageDecorator {
    public UpperCaseMessageDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        return super.getContent().toUpperCase();
    }
}