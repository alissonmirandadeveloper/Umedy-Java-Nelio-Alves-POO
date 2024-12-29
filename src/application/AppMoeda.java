package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class AppMoeda {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preço do dolar: ");
        double dollarRate = sc.nextDouble();
        System.out.println("Quantos dólares voce vai comprar? ");
        double dollarAmount = sc.nextDouble();

        double total = CurrencyConverter.convert(dollarRate, dollarAmount);
        System.out.printf("O valor a ser pago em reais = %.2f%n", total);

        sc.close();
    }
}
