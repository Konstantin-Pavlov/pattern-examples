package org.example.patterns.template;

public class WelcomePage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("welcome!");
    }
}
