package com.udea.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvaluationRequest {
    private Passenger passenger;
    private Flight flight;
    private Luggage luggage;
}
