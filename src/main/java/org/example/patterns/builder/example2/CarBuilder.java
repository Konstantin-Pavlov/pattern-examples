package org.example.patterns.builder.example2;

public interface CarBuilder {
    CarBuilder fixChassis();

    CarBuilder fixBody();

    CarBuilder paint();

    CarBuilder fixInterior();

    Car build();
}
