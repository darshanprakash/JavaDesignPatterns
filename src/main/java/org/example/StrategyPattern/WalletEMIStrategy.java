package org.example.StrategyPattern;

import java.util.LinkedList;
import java.util.List;

public class WalletEMIStrategy implements EMIStrategy {

    private String name;

    public WalletEMIStrategy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<EMI> getEMIPlans(Loan loanProduct) {
        List<EMI> eMIs = new LinkedList<>();
        eMIs.add(new EMI(3, 8.0));
        eMIs.add(new EMI(6, 9.0));
        return eMIs;
    }
}
