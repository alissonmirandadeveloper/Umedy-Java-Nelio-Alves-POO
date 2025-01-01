package application;

import java.util.Locale;
import java.util.Scanner;

public class LabNegativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
