/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz4;

import java.util.ArrayList;
import java.util.List;

public class RideManager {
    private final List<Rideable> rides = new ArrayList<>();

    public void addRide(Rideable ride) {
        rides.add(ride);
    }

    public List<String> getFareSummaries() {
        List<String> summaries = new ArrayList<>();
        for (Rideable ride : rides) {
            summaries.add(ride.getFareBreakdown());
        }
        return summaries;
    }
}
