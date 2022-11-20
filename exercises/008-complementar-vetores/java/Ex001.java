package listacomplementar;

import java.io.*;

public class Ex001 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new 
                BufferedReader(new InputStreamReader(System.in));

        final int TAM = 20;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        
        int contPar = 0;
        int contImpar = TAM - 1;

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "o. elemento:");
            a[i] = Integer.parseInt(in.readLine());

            if (a[i] % 2 == 0) {
                b[contPar] = a[i];
                contPar++;
            } else {
                b[contImpar] = a[i];
                contImpar--;
            }
        }

        System.out.print("\nElementos Pares:\nPAR: ");
        for (int i = 0; i < contPar; i++) {
            System.out.print(b[i] + " | ");
        }
        System.out.print("\nElementos Impares:\nIMPAR: ");
        for (int i = TAM - 1; i >= contPar; i--) {
            System.out.print(b[i] + " | ");
        }

        System.out.println("\nVetor B:");
        for (int i : b) {
            System.out.print(i + " | ");
        }

    }
}
