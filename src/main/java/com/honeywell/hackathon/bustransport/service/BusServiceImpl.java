package com.honeywell.hackathon.bustransport.service;

import com.honeywell.hackathon.bustransport.model.BusResource;
import com.honeywell.hackathon.bustransport.exception.ErrorMessage;
import com.honeywell.hackathon.bustransport.exception.ErrorType;
import com.honeywell.hackathon.bustransport.exception.ResourceNotFoundException;
import com.honeywell.hackathon.bustransport.util.TransportUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    Logger LOGGER = LoggerFactory.getLogger(BusServiceImpl.class);

    @Autowired
    TransportUtil productHelper;

    @Override
    public BusResource getBusDetails(Integer busId) throws ResourceNotFoundException {
        LOGGER.info("getBusDetails for busId={}", busId);
        //TODO DB integration
        BusResource busResource = new BusResource();
        if (busResource == null) {
            throw new ResourceNotFoundException(null, new ErrorMessage(ErrorType.RESOURCE_NOT_FOUND, String.valueOf(busId)));
        }
        return busResource;
    }
}
