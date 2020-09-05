package com.honeywell.hackathon.bustransport.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fuel")
public class Fuel {
    @Id
    String id;

    @Indexed(unique = true)
    Integer busId;

    Integer fuelCapacity;

    Integer fuelLeft;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Integer getFuelLeft() {
        return fuelLeft;
    }

    public void setFuelLeft(Integer fuelLeft) {
        this.fuelLeft = fuelLeft;
    }
}
