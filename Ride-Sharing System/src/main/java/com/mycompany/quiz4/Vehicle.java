/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz4;

/**
 *
 * @author 10280
 */
public abstract class Vehicle {
    protected String licensePlate;
    protected String driverName;
    protected float baseFare;

    public Vehicle(String licensePlate, String driverName, float baseFare) {
        this.licensePlate = licensePlate;
        this.driverName = driverName;
        this.baseFare = baseFare;
    }

    public abstract double calculateFare(double distance);
    public abstract String getVehicleType();
}
