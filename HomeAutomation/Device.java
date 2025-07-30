package com.example.home;

import org.springframework.stereotype.Component;

@Component
public class Device {
	 private String deviceType = "Smart Light";
	    private boolean status = false;

	    public void turnOn() {
	        status = true;
	        System.out.println(deviceType + " is turned ON.");
	    }

	    public void turnOff() {
	        status = false;
	        System.out.println(deviceType + " is turned OFF.");
	    }

	    public String getDeviceType() {
	        return deviceType;
	    }

	    public boolean isStatus() {
	        return status;
	    }
}
