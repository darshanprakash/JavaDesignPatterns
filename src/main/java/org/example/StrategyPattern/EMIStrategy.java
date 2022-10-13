package org.example.StrategyPattern;

import java.util.List;

public interface EMIStrategy {
    public List<EMI> getEMIPlans(Loan loanProduct);
}
