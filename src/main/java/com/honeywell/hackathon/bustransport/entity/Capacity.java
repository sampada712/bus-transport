package com.honeywell.hackathon.bustransport.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "capacity")
public class Capacity {

    @Id
    String id;

    @Indexed(unique = true)
    Integer busId;

    Integer fullCapacity;

    Integer currentCapacity;

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

    public Integer getFullCapacity() {
        return fullCapacity;
    }

    public void setFullCapacity(Integer fullCapacity) {
        this.fullCapacity = fullCapacity;
    }

    public Integer getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
