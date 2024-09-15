package org.example.patterns.state.trucks.util;

import org.example.patterns.exceptions.CustomException;
import org.example.patterns.state.trucks.model.Driver;
import org.example.patterns.state.trucks.model.Truck;

public class MotorDepot {

    private static final Truck[] trucks = JsonReader.loadJArrayFromJson("src/main/java/org/example/patterns/state/trucks/data/trucks.json", Truck[].class);
    private static final Driver[] drivers = JsonReader.loadJArrayFromJson("src/main/java/org/example/patterns/state/trucks/data/drivers.json", Driver[].class);

    private MotorDepot() {

    }

    public static Truck[] getTrucks() {
        return trucks;
    }

    public static Driver[] getDrivers() {
        return drivers;
    }

    public static Driver getAvalibleDriver() throws CustomException {
        if (drivers != null) {
            for (Driver driver : drivers) {
                if (driver.isAvailable()) {
                    return driver;
                }
            }
        } else {
            throw new CustomException("Попытка получить водителя при пустом массиве водителей");
        }
        return null;
    }
}
