package com.example.forecast;

public class FinancialForecaster {

    private static double average(double[] rates) {
        double sum = 0;
        for (double r : rates) {
            sum += r;
        }
        return sum / rates.length;
    }

    public static double forecast(double currentValue, double avgGrowthRate, int periods) {
        if (periods <= 0) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + avgGrowthRate);
        return forecast(nextValue, avgGrowthRate, periods - 1);
    }

    public static void main(String[] args) {
        double[] historicalRates = { 0.03, 0.04, 0.025, 0.05 };
        double startingValue    = 1000;       
        int    quartersAhead    = 8;     
        double avgRate   = average(historicalRates);
        double prediction = forecast(startingValue, avgRate, quartersAhead);

        System.out.printf("Forecasted value after %d periods: %.2f%n",
                          quartersAhead, prediction);
    }
}
