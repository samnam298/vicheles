package com.pluralsight;

public class Hovercraft extends Vehicle {
    private int maxSpeed;

    public Hovercraft(String make, String model, int year, int maxSpeed) {
        super(make, model, year);
        this.maxSpeed = maxSpeed;
    }

    public void displayHovercraftInfo() {
        displayInfo();
        System.out.println("Max speed: " + maxSpeed + " mph");
    }
}
