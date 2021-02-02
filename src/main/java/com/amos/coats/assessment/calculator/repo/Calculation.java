package com.amos.coats.assessment.calculator.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculation")
public class Calculation {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer a;

    private Integer b;

    private String operator;

    private Double result;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operation) {
        this.operator = operation;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
