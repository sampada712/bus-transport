package com.honeywell.hackathon.bustransport.repository;

import com.honeywell.hackathon.bustransport.entity.Capacity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CapacityRepository extends MongoRepository<String, Capacity> {

    Capacity findByBusId(Integer busId);
}
