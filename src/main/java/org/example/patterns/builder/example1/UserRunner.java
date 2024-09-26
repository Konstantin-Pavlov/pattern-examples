package org.example.patterns.builder.example1;

public class UserRunner {
    public static void main(String[] args) {
        User user = new User()
                .setName("Tom")
                .setAge(42)
                .setAddress("8th street");
        System.out.println(user);
    }
}
