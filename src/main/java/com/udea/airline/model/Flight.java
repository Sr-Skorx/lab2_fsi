package com.udea.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    private int delayMinutes; // minutos de retraso
    private double flightDurationHours; // duración del vuelo en horas
    private boolean emergencyExitSeatAvailable; // si hay asientos de salida disponibles
}
