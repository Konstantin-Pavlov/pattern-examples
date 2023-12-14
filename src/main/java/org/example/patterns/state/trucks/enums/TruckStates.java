package org.example.patterns.state.trucks.enums;

public enum TruckStates {
    ON_BASE("returned to base"), ON_PARKING("Stopped in the parking lot"), ON_REPAIR("arrived for repairs"), ON_ROUTE("hit the road");

    final String status;

    TruckStates(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
