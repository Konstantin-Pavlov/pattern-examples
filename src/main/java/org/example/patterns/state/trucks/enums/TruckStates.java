package org.example.patterns.state.trucks.enums;

public enum TruckStates {
    ONBASE("returned to base"), ONPARKING("Stopped in the parking lot"), ONREPAIR("arrived for repairs"), ONROUTE("hit the road");

    String status;

    TruckStates(String s) {
    }

    public String getStatus() {
        return status;
    }
}
