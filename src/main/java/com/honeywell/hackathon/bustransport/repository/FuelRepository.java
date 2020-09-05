package com.honeywell.hackathon.bustransport.repository;

import com.honeywell.hackathon.bustransport.entity.Fuel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuelRepository extends MongoRepository<String, Fuel> {
    Fuel findByBusId(Integer busId);
}
