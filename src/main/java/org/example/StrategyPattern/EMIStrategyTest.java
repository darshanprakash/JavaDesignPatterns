package org.example.StrategyPattern;

public class EMIStrategyTest {

    public static void main(String[] args) {
        Wallet wallet = new Wallet();

        Loan loan1 = new Loan(75, 100.00, 3);

        wallet.addLoanProduct(loan1);

        wallet.showEMIs(new BankEMIStrategy("Indian Bank"));

        wallet.showEMIs(new WalletEMIStrategy("Bharat wallet"));
    }
}
