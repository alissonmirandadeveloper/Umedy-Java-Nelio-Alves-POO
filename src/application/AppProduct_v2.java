package application;

import entities.Product_v2;

import java.util.Locale;
import java.util.Scanner;

public class AppProduct_v2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product_v2[] products = new Product_v2[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Product_v2(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += products[i].getPrice();
        }
        double avg = sum / products.length;

        System.out.printf("AVERAGE PRICE %.2f\n", avg);
        sc.close();
    }
}
