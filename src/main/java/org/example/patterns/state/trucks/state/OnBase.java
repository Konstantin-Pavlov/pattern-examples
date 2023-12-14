package org.example.patterns.state.trucks.state;

import exceptions.CustomException;


import org.example.patterns.state.trucks.enums.TruckStates;
import org.example.patterns.state.trucks.interfaces.State;
import org.example.patterns.state.trucks.model.Driver;
import org.example.patterns.state.trucks.model.Truck;
import org.example.patterns.state.trucks.util.MotorDepot;

public class OnBase implements State {

    public static TruckStates state = TruckStates.ON_BASE;

    @Override
    public void changeDriver(Truck truck) throws CustomException {
        Driver newDriver;
        try {
            newDriver = MotorDepot.getAvalibleDriver();
        } catch (CustomException e) {
            throw new CustomException(e.getMessage());
        }
        if (newDriver == null) {
            throw new CustomException("нет свободных водителей");
        }
        truck.getDriver().setAvailable(true);
        truck.setDriver(newDriver);
        newDriver.setAvailable(false);
        System.out.printf("теперь грузовик %s ведёт водитель %s%n", truck.getTruckBrand(), newDriver.getName());
    }

    @Override
    public void startDriving(Truck truck) {
        truck.setState(new OnRoute());
        System.out.println("успешно вышли на маршрут");
    }

    @Override
    public void startRepair(Truck truck) throws CustomException {
        truck.setState(new OnRepair());
        System.out.println("успешно встали на ремонт");
    }
}
