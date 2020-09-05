package com.honeywell.hackathon.bustransport.repository;

import com.honeywell.hackathon.bustransport.entity.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<String, Bus> {

    Bus findByBusId(Integer id);
}
