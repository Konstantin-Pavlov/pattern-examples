package org.example.patterns.chainOfResponsibility;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending sms to manager: " + message);
    }
}
