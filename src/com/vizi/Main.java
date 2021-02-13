package com.vizi;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualIntrest = (float) Console.readNumber("Annual Intrest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period(Years): ",1,30);
        var calculator = new MortgageCalculator(principal, annualIntrest,years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}

