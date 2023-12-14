package org.example.patterns.state.trucks.state;

import exceptions.CustomException;
import org.example.patterns.state.trucks.interfaces.State;
import org.example.patterns.state.trucks.model.Truck;

public class OnParking extends OnBase implements State {
    @Override
    public void startRepair(Truck truck) throws CustomException {
        throw new CustomException("невозможно встать на ремонт на стоянке");
    }
}
