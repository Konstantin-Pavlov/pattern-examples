package org.example.patterns.state.trucks.interfaces;

import org.example.patterns.state.trucks.model.Driver;
import org.example.patterns.state.trucks.model.Truck;

public interface Office {
    public void run(Truck[] trucks, Driver[] drivers);
}
