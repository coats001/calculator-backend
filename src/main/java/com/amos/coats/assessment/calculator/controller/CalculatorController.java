package com.amos.coats.assessment.calculator.controller;


import com.amos.coats.assessment.calculator.repo.Calculation;
import com.amos.coats.assessment.calculator.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CalculatorController {

    @Autowired
    CalculationService calculationService;

    @PostMapping("/calculate")
    public List<Calculation> calculate(@RequestBody Calculation calculation) {
        return calculationService.calculateAndPersist(calculation);
    }

}
