package com.pluralsight;

public class Car extends Vehicle {
    private int doors;

    // Child constructor that calls parent constructor
    public Car(String make, String model, int year, int doors) {
        super(make, model, year);  // calls Vehicle’s constructor
        this.doors = doors;
    }

    public void displayCarInfo() {
        displayInfo(); // from Vehicle
        System.out.println("Doors: " + doors);
    }
}
