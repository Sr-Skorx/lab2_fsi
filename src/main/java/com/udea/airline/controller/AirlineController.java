package com.udea.airline.controller;

import com.udea.airline.model.EvaluationRequest;
import com.udea.airline.model.EvaluationResponse;
import com.udea.airline.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airline")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @PostMapping("/evaluate")
    public EvaluationResponse evaluatePassenger(@RequestBody EvaluationRequest request) {
        return airlineService.evaluatePassenger(request);
    }
}
