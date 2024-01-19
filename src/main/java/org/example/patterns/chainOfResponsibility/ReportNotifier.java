package org.example.patterns.chainOfResponsibility;

public class ReportNotifier extends Notifier {
    public ReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
