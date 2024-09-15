

package org.example.patterns.state.trucks.state;

import org.example.patterns.exceptions.CustomException;
import org.example.patterns.state.trucks.enums.TruckStates;
import org.example.patterns.state.trucks.interfaces.State;
import org.example.patterns.state.trucks.model.Truck;

import java.util.Random;

public class OnRepair implements State {

    @Override
    public void changeDriver(Truck truck) throws CustomException {
        throw new CustomException("Нельзя сменить водителя");
    }

    @Override
    public void startDriving(Truck truck) {
        if (new Random().nextBoolean()) {
            truck.setState(new OnRoute());
        } else {
            truck.setState(new OnBase());
        }
    }

    @Override
    public void startRepair(Truck truck) throws CustomException {
        throw new CustomException("Уже в ремонте");
    }

    @Override
    public TruckStates getStateMessage() {
        return TruckStates.ON_REPAIR;
    }


}
