package com.honeywell.hackathon.bustransport.controller;

import com.honeywell.hackathon.bustransport.exception.ResourceNotFoundException;
import com.honeywell.hackathon.bustransport.model.BusResource;
import com.honeywell.hackathon.bustransport.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/buses")
public class BusController {

    @Autowired
    BusService busService;

    @GetMapping("/{busId}")
    public BusResource getBusDetails(@PathVariable("busId") Integer busId) throws ResourceNotFoundException {
        return busService.getBusDetails(busId);
    }

}
