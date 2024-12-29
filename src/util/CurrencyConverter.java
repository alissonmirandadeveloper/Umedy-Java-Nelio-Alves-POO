package util;

public class CurrencyConverter {

    public static double convert(double dollarRate, double dollarAmount) {
        double totalWithoutTax  = dollarRate * dollarAmount;
        double tax = totalWithoutTax * 0.06;
        return totalWithoutTax + tax;
    }
}
