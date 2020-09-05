package com.honeywell.hackathon.bustransport.controller;

import com.honeywell.hackathon.bustransport.exception.ResourceNotFoundException;
import com.honeywell.hackathon.bustransport.model.BusResource;
import com.honeywell.hackathon.bustransport.service.BusService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusControllerTest {

    @Mock
    BusService busService;

    @InjectMocks
    BusController busController;

    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetBusDetails() throws ResourceNotFoundException {
        BusResource busResource = new BusResource();
        busResource.setBusId(1223);
        Mockito.when(busService.getBusDetails(Mockito.eq(1223))).thenReturn(busResource);
        busResource = busController.getBusDetails(1223);
        Assert.assertNotNull(busResource);
    }
}
