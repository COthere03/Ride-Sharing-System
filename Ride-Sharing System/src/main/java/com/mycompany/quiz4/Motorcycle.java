/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz4;

/**
 *
 * @author 10280
 */
public class Motorcycle extends Vehicle implements Rideable {
    private double lastDistance;
    private double lastFare;

    public Motorcycle(String licensePlate, String driverName, float baseFare) {
        super(licensePlate, driverName, baseFare);
    }

    public double calculateFare(double distance) {
        lastDistance = distance;
        lastFare = baseFare + distance * 2.0;
        return lastFare;
    }

    public String getVehicleType() {
        return "Motorcycle";
    }

    public void startRide() {}

    public void endRide() {}

    public String getFareBreakdown() {
    return String.format(
            
            "Type of Vehicle: %s\n" +
            "Driver Name: %s\n" +
            "License Plate: %s\n" +
            "Distance: %.2f km\n" +
            "Fare: %.2f",
            getVehicleType(), driverName, licensePlate, lastDistance, lastFare
    );
}

}
