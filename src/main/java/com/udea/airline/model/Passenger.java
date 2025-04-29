package com.udea.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {

    private String name;
    private int age;
    private String membershipStatus; // "Basic", "Gold", "Platinum"
    private boolean travelingWithChildren; // true o false
    private String seatPreference; // "Window", "Aisle", "Any"
}
