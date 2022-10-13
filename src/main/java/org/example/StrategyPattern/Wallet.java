package org.example.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

    List<Loan> loans;

    public Wallet() {
        loans = new ArrayList<Loan>();
    }

    public void addLoanProduct(Loan loan) {
        loans.add(loan);
    }

    public void showEMIs(EMIStrategy emiStrategyPlan) {
        for(Loan loan: loans){
            List<EMI> emiList = emiStrategyPlan.getEMIPlans(loan);
            System.out.println("For loan of amount Rs." + loan.getPrincipal() +
                    " the plans available from "+ emiStrategyPlan.getClass().getSimpleName() +" are: ");
            for(EMI emiPlan : emiList){
                Integer months = emiPlan.getNumberOfMonths();
                Double interestRate = emiPlan.getInterest();
                System.out.println("EMI plan months: " + months + " at interest rate: " + interestRate);
            }
        }
    }
}
