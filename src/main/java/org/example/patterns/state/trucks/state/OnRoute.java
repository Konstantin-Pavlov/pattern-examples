package org.example.patterns.state.trucks.state;

import exceptions.CustomException;
import org.example.patterns.state.trucks.interfaces.State;
import org.example.patterns.state.trucks.model.Truck;

public class OnRoute implements State {
    @Override
    public void changeDriver(Truck truck) throws CustomException {
        throw new CustomException("Грузовик в пути, невозможно сменить водителя");
    }

    @Override
    public void startDriving(Truck truck) throws CustomException {
        throw new CustomException("Грузовик уже в пути");
    }

    @Override
    public void startRepair(Truck truck) {
        truck.setState(new OnRepair());
        System.out.println("успешно встали на ремонт");
    }


}
