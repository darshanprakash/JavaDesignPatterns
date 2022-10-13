package org.example.StrategyPattern;

public class EMI {

    private Integer numberOfMonths;

    private Double interest;

    public EMI(Integer numberOfMonths, Double interest) {
        this.numberOfMonths = numberOfMonths;
        this.interest = interest;
    }

    public Integer getNumberOfMonths() {
        return numberOfMonths;
    }

    public Double getInterest() {
        return interest;
    }
}
