package org.example.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null){
            developer = switch (specialty) {
                case "java" -> {
                    System.out.println("new Java developer");
                    yield new JavaDeveloper();
                }
                case "cpp" -> {
                    System.out.println("new C++ developer");
                    yield new CppDeveloper();
                }
                default -> developer;
            };
            developers.put(specialty, developer);
        }
        return developer;
    }
}
