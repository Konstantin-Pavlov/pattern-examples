package org.example.patterns.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Ideveloper junior = new JuniorDeveloper();
        Ideveloper senior = new SeniorDeveloper();

        System.out.println("Junior in action..");
        project.beWritten(junior);

        System.out.println("#".repeat(42));

        System.out.println("Senior in action..");
        project.beWritten(senior);
    }
}
