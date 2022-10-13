package org.example.StrategyPattern;

public class Loan {
    private Integer score;
    private Double principal;
    private Integer duration;

    public Loan(Integer score, Double principal, Integer duration) {
        this.score = score;
        this.principal = principal;
        this.duration = duration;
    }

    private Double interest;

    public Integer getScore() {
        return score;
    }

    public Double getPrincipal() {
        return principal;
    }

    public Integer getDuration() {
        return duration;
    }
}
