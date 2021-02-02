package com.amos.coats.assessment.calculator.service;

import com.amos.coats.assessment.calculator.repo.Calculation;
import com.amos.coats.assessment.calculator.repo.CalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Autowired
    CalculationRepository repository;

    @Override
    public List<Calculation> calculateAndPersist(Calculation calculation) {
        if (calculation.getOperator().equals("+")) {
            calculation.setResult(add(calculation.getA(), calculation.getB()));
            repository.save(calculation);
        } else if (calculation.getOperator().equals("-")) {
            calculation.setResult(subtract(calculation.getA(), calculation.getB()));
            repository.save(calculation);
        } else if (calculation.getOperator().equals("*")) {
            calculation.setResult(multiply(calculation.getA(), calculation.getB()));
            repository.save(calculation);
        } else if (calculation.getOperator().equals("/")) {
            calculation.setResult(divide(calculation.getA(), calculation.getB()));
            repository.save(calculation);
        }

        return (List)repository.findAll();
    }

    private double add(int a, int b) {
        return (double) a + b;
    }


    private double subtract(int a, int b) {
        return (double) a - b;
    }


    private double multiply(int a, int b) {
        return (double) a * b;
    }


    private double divide(int a, int b) {
        return (double) a / b;
    }

}
