package org.example.patterns.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        loadProject();
    }

    private void loadProject() {
        System.out.println("Loading project from " + url + "...");
        // Симулируем долгую загрузку проекта
        try {
            Thread.sleep(2000); // Пауза в 2 секунды, чтобы симулировать время загрузки
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Running project from " + url);
    }
}