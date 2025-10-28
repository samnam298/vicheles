package com.pluralsight;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    //  Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //  Getters
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    //  Display info
    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}
