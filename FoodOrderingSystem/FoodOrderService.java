package com.example.food;

import java.util.List;

public class FoodOrderService {

	
	private Customer customer;
    private List<Restaurant> restaurants;

    public FoodOrderService(Customer customer, List<Restaurant> restaurants) {
        this.customer = customer;
        this.restaurants = restaurants;
    }

    public void placeOrder() {
        String preferredCuisine = customer.getPreferredCuisine();
        System.out.println("Searching for restaurants serving: " + preferredCuisine);

        boolean found = false;
        for (Restaurant r : restaurants) {
            if (r.servesCuisine(preferredCuisine)) {
                System.out.println("Order placed with " + r.getName() + " for " + customer.getName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(" No restaurant found serving " + preferredCuisine);
        }
    }
	
	
}
