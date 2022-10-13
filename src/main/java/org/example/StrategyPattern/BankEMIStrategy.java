package org.example.StrategyPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BankEMIStrategy implements EMIStrategy {

    private String name;

    public BankEMIStrategy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<EMI> getEMIPlans(Loan loanProduct) {
        List<EMI> eMIs = new LinkedList<>();
        eMIs.add(new EMI(3, 8.5));
        eMIs.add(new EMI(6, 9.5));
        return eMIs;
    }
}
