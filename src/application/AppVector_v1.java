package application;

import java.util.Locale;
import java.util.Scanner;

public class AppVector_v1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += v[i];
        }

        double avg = sum / v.length;

        System.out.printf("AVERAGE HEIGTH: %.2f%n", avg);

        sc.close();
    }
}
