import java.io.*;

public class Ex003 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = 
                new BufferedReader(new InputStreamReader(System.in));

        final int TAM = 10;
        int[] a = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "o. elemento do vetor:");
            a[i] = Integer.parseInt(in.readLine());
        }

        for (int i : a) {
            System.out.println(i + " primo = " + isPrimo(i));
        }
    }

    public static boolean isPrimo(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
