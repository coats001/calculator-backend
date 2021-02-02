package com.amos.coats.assessment.calculator.service;

import com.amos.coats.assessment.calculator.repo.Calculation;

import java.util.List;

public interface CalculationService {

    public List<Calculation> calculateAndPersist(Calculation calculation);

}
