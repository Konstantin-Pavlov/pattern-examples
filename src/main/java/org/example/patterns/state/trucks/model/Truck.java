package org.example.patterns.state.trucks.model;

import org.example.patterns.exceptions.CustomException;
import org.example.patterns.state.trucks.interfaces.State;

public class Truck {
    private int id;
    private String truckBrand;
    private String driverName;
    private String truckLocation;
    private Driver driver;
    private State state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTruckBrand() {
        return truckBrand;
    }

    public void setTruckBrand(String truckBrand) {
        this.truckBrand = truckBrand;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTruckLocation() {
        return this.truckLocation;
    }

    public void setTruckLocation(String truckLocation) {
        this.truckLocation = truckLocation;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
        this.setDriverName(driver.getName());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.setTruckLocation(this.state.getStateMessage().getStatus());
    }

    public void changeDriver() {
        try {
            state.changeDriver(this);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public void startDriving() {
        try {
            state.startDriving(this);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public void startRepair() {
        try {
            state.startRepair(this);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + truckBrand + '\'' +
                ", driver='" + driverName + '\'' +
                ", state='" + truckLocation + '\'' +
                '}';
    }
}
