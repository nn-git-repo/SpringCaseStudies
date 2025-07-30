package com.example.food;

public class Restaurant {
    private String name;
    private String location;
    private String[] cuisines;

    public Restaurant(String name, String location, String[] cuisines) {
        this.name = name;
        this.location = location;
        this.cuisines = cuisines;
    }

    public boolean servesCuisine(String cuisine) {
        for (String c : cuisines) {
            if (c.equalsIgnoreCase(cuisine)) return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
