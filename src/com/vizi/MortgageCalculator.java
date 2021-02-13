package com.vizi;

public class MortgageCalculator {
    private final static byte MONTH_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualIntrest;
    private byte years;
//constructor
    public MortgageCalculator(int principal, float annualIntrest, byte years) {
        this.principal = principal;
        this.annualIntrest = annualIntrest;
        this.years = years;
    }
//end of constructor
    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyIntrest = getMonthlyIntrest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal * ((Math.pow(1 + monthlyIntrest, numberOfPayments)) - (Math.pow(1 + monthlyIntrest, numberOfPaymentsMade))) / ((Math.pow(1 + monthlyIntrest, numberOfPayments) - 1));
        return balance;
    }

    public double calculateMortgage() {
        float monthlyIntrest = getMonthlyIntrest();
        float numberOfPayments = getNumberOfPayments();

        double mortage = principal * ((monthlyIntrest * (Math.pow(1+monthlyIntrest, numberOfPayments))) / (Math.pow(1+monthlyIntrest, numberOfPayments)-1));
        return mortage;
    }

    public double[] getRemainingBalanaces() {
        var balances = new double[(int) getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }

    private float getNumberOfPayments() {
        return years * MONTH_IN_YEAR;
    }
    private float getMonthlyIntrest() {
        return (annualIntrest / PERCENT) / MONTH_IN_YEAR;
    }
}
