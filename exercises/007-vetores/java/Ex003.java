package lista006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex003 {

    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        final int TAM = 10;
        int[] a = new int[TAM];
        int contPar = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "o. elemento de A");
            a[i] = Integer.parseInt(in.readLine());
        }

        System.out.println("Vetor A:");
        for (int i : a) {

            System.out.print(i + " | ");
        }

        System.out.println("Números Pares:");
        for (int i : a) {
            if (i % 2 == 0) {
                System.out.print(i + " | ");
                contPar++;
            }
        }
        System.out.println("\nContei " + contPar + " numeros pares.");


    }
}
