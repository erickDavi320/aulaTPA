package lista006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex002 {

    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        final int TAM = 10;
        int[] a = new int[TAM];
        int[] b = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "o. elemento de A");
            a[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 9; i >= 0; i--) {
            b[i] = a[TAM - i - 1];
        }

        System.out.println("Vetor A:");
        for (int i : a) {

            System.out.print(i + " | ");
        }

        System.out.println("\nVetor B:");
        for (int i : b) {
            System.out.print(i + " | ");
        }

    }

}
