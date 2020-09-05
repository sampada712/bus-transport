package com.honeywell.hackathon.bustransport.service;

import com.honeywell.hackathon.bustransport.entity.Bus;
import com.honeywell.hackathon.bustransport.entity.Capacity;
import com.honeywell.hackathon.bustransport.entity.Fuel;
import com.honeywell.hackathon.bustransport.exception.ErrorMessage;
import com.honeywell.hackathon.bustransport.exception.ErrorType;
import com.honeywell.hackathon.bustransport.exception.ResourceNotFoundException;
import com.honeywell.hackathon.bustransport.model.BusResource;
import com.honeywell.hackathon.bustransport.repository.BusRepository;
import com.honeywell.hackathon.bustransport.repository.CapacityRepository;
import com.honeywell.hackathon.bustransport.repository.FuelRepository;
import com.honeywell.hackathon.bustransport.util.TransportUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    Logger LOGGER = LoggerFactory.getLogger(BusServiceImpl.class);

    @Autowired
    TransportUtil util;

    @Autowired
    BusRepository busRepository;

    @Autowired
    FuelRepository fuelRepository;

    @Autowired
    CapacityRepository capacityRepository;

    @Override
    public BusResource getBusDetails(Integer busId) throws ResourceNotFoundException {
        LOGGER.info("getBusDetails for busId={}", busId);
        Bus bus = busRepository.findByBusId(busId);
        if (bus == null) {
            throw new ResourceNotFoundException(null, new ErrorMessage(ErrorType.RESOURCE_NOT_FOUND, String.valueOf(busId)));
        }
        Capacity capacity = capacityRepository.findByBusId(busId);
        Fuel fuel = fuelRepository.findByBusId(busId);
        return util.buildBusResource(bus, capacity, fuel);
    }
}
