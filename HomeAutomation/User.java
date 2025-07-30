package com.example.home;

import org.springframework.stereotype.Component;

@Component
public class User {

	 private String name = "Namratha";
	    private String homeId = "HOME123";

	    public String getName() {
	        return name;
	    }

	    public String getHomeId() {
	        return homeId;
	    }
	
	
}
