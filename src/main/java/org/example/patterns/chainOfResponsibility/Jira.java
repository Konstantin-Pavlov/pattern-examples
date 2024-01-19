package org.example.patterns.chainOfResponsibility;

public class Jira {
    public static void main(String[] args) {
        Notifier reportNotifier = new ReportNotifier(Prilrity.NORMAL);
        Notifier eamilNotifier = new EmailNotifier(Prilrity.IMPORTANT);
        Notifier smstNotifier = new SmsNotifier(Prilrity.CRITICAL);

        reportNotifier.setNextNotifier(eamilNotifier);
        eamilNotifier.setNextNotifier(smstNotifier);

        reportNotifier.notifyManager("Evetything is ok", Prilrity.NORMAL);
        System.out.println("#".repeat(42));
        reportNotifier.notifyManager("Something went wrong...", Prilrity.IMPORTANT);
        System.out.println("#".repeat(42));
        reportNotifier.notifyManager("SOS!!", Prilrity.CRITICAL);
    }
}
