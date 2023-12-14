package org.example.patterns.state.trucks.enums;

public enum TruckStates {
    ON_BASE("returned to base"), ON_PARKING("Stopped in the parking lot"), ON_REPAIR("arrived for repairs"), ON_ROUTE("hit the road");

    String status;

    TruckStates(String s) {
    }

    public String getStatus() {
        return status;
    }
}
