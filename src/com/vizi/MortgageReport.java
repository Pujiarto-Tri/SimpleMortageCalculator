package com.vizi;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;


    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("----------------");
        for (double balance :calculator.getRemainingBalanaces())
            System.out.println(currency.format(balance));
    }

    public void printMortgage() {
        double mortage = calculator.calculateMortgage();
        NumberFormat mortageFormatted = currency;
        String result = mortageFormatted.format(mortage);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments:" +result);
    }
}
