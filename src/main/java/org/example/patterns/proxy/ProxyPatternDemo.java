package org.example.patterns.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/example/project");

        // Проект загружается только при первом вызове метода run()
        System.out.println("Calling run() for the first time:");
        project.run();

        System.out.println("\nCalling run() again:");
        project.run();
    }
}
