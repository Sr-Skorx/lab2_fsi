package com.udea.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvaluationResponse {

    private boolean upgradeToBusiness; 
    private boolean priorityCheckIn;
    private boolean denyUpgrade;
    private boolean assignEmergencyExitSeat;ñ
    private boolean compensationGranted;
    private int extraLoyaltyPoints;
    private boolean restrictLuggage;
    private boolean vipLoungeAccess;
    private boolean preferentialFamilySeat;
    private double discountPercentage; // % de descuento en equipaje
    private String message; // resumen general de beneficios otorgados
}
