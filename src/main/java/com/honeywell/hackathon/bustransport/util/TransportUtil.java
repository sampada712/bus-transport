package com.honeywell.hackathon.bustransport.util;

import com.honeywell.hackathon.bustransport.entity.Bus;
import com.honeywell.hackathon.bustransport.entity.Capacity;
import com.honeywell.hackathon.bustransport.entity.Fuel;
import com.honeywell.hackathon.bustransport.model.BusResource;
import org.springframework.stereotype.Component;

@Component
public class TransportUtil {

    public BusResource buildBusResource(Bus bus, Capacity capacity, Fuel fuel) {
        BusResource busResource = new BusResource();
        busResource.setBusId(bus.getBusId());
        busResource.setLocation(bus.getLocation());
        busResource.setName(bus.getName());
        if (capacity != null) {
            busResource.setSeatsAvailable(capacity.getCurrentCapacity());
        }
        if (fuel == null) {
            busResource.setFuelLeft(fuel.getFuelLeft());
        }
        return busResource;
    }
}
