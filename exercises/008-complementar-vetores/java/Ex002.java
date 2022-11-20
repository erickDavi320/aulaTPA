import java.io.*;

public class Ex002 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new 
                BufferedReader(new InputStreamReader(System.in));

        final int TAM = 5;
        int[] a = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "o. elemento da lista:");
            a[i] = Integer.parseInt(in.readLine());
        }

        for (int k : a) {

            System.out.println("\nTABUADA DO " + k + " :");

            for (int j = 1; j <= 10; j++) {
                System.out.println(k + " x " + j + " = " + (k * j));
            }
        }

    }
}
