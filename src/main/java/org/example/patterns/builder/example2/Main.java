package org.example.patterns.builder.example2;

import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        if (car != null) {
            System.out.println(car);
        }

        InputStreamReader in = new InputStreamReader(System.in);
    }
}
