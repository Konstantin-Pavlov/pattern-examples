package org.example.patterns.state.trucks.interfaces;

import exceptions.CustomException;
import org.example.patterns.state.trucks.model.Truck;

public interface State {
    void changeDriver(Truck truck) throws CustomException;

    void startDriving(Truck truck) throws CustomException;

    void startRepair(Truck truck) throws CustomException;
}
