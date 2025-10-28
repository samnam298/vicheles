package com.pluralsight;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void displayTruckInfo() {
        displayInfo();
        System.out.println("Payload capacity: " + payloadCapacity + " tons");
    }
}
