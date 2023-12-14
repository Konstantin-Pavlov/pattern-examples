package org.example.patterns.state.trucks;

import org.example.patterns.state.trucks.interfaces.State;
import org.example.patterns.state.trucks.model.Driver;
import org.example.patterns.state.trucks.model.Truck;
import org.example.patterns.state.trucks.model.TruckOffice;
import org.example.patterns.state.trucks.state.OnBase;
import org.example.patterns.state.trucks.state.OnParking;
import org.example.patterns.state.trucks.state.OnRepair;
import org.example.patterns.state.trucks.state.OnRoute;
import org.example.patterns.state.trucks.util.MotorDepot;

import java.util.Arrays;
import java.util.Random;

public class TruckRunner {
    public static void main(String[] args) {
        Truck[] trucks = MotorDepot.getTrucks();
        Driver[] drivers = MotorDepot.getDrivers();
        State[] states = {new OnBase(), new OnRepair(), new OnRoute(), new OnParking()};
        TruckOffice office = new TruckOffice();

        System.out.println("закрепление водителей за грузовиками");
        for (int i = 0; i < trucks.length; i++) {
            trucks[i].setDriver(drivers[i]);
            trucks[i].getDriver().setAvailable(false);
        }

        //  назначение грузовикам состояний случайным образом (в пути, на базе, на ремонте)
        for (Truck truck : trucks) {
            int r = new Random().nextInt(4);
            truck.setState(states[r]);
        }

//        Arrays.stream(trucks != null ? trucks : new Truck[0]).forEach(System.out::println);
//        System.out.println();
//        Arrays.stream(drivers != null ? drivers : new Driver[0]).forEach(System.out::println);

//        trucks[0].setState(new OnParking());
//        trucks[0].startRepair();
//        trucks[0].startDriving();
//        trucks[0].changeDriver();

        office.run(trucks, drivers);


    }
}
