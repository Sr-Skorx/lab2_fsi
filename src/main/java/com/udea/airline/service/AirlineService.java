package com.udea.airline.service;

import com.udea.airline.model.EvaluationRequest;
import com.udea.airline.model.EvaluationResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {

    @Autowired
    private KieContainer kieContainer;

    public EvaluationResponse evaluatePassenger(EvaluationRequest request) {
        EvaluationResponse response = new EvaluationResponse();
        KieSession kieSession = kieContainer.newKieSession();
        try {
            // Insertamos los datos que vienen del EvaluationRequest
            kieSession.insert(request.getPassenger());
            kieSession.insert(request.getFlight());
            kieSession.insert(request.getLuggage());
            kieSession.insert(response); // Aquí Drools escribirá el resultado

            // Disparamos todas las reglas
            kieSession.fireAllRules();
        } finally {
            // Cerramos la sesión para liberar recursos
            kieSession.dispose();
        }
        return response; // Devolvemos el resultado que llenaron las reglas
    }
}
