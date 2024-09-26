package org.example.patterns.decorator;

class PrefixMessageDecorator extends MessageDecorator {
    private String prefix;

    public PrefixMessageDecorator(Message decoratedMessage, String prefix) {
        super(decoratedMessage);
        this.prefix = prefix;
    }

    @Override
    public String getContent() {
        return prefix + " " + super.getContent();
    }
}
