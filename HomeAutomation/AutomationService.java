package com.example.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutomationService {

	
	@Autowired
    private User user;

    @Autowired
    private Device device;

    public void controlDevice() {
        System.out.println("User: " + user.getName() + " from Home ID: " + user.getHomeId());
        System.out.println("Controlling Device: " + device.getDeviceType());

        device.turnOn();
        device.turnOff();
    }
	
	
	
	
	
}
