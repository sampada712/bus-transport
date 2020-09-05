package com.honeywell.hackathon.bustransport.service;

import com.honeywell.hackathon.bustransport.exception.ResourceNotFoundException;
import com.honeywell.hackathon.bustransport.model.BusResource;

public interface BusService {

    BusResource getBusDetails(Integer busId) throws ResourceNotFoundException;

}
