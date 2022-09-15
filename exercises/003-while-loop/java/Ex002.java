import java.io.*;

public class Ex002 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new
                BufferedReader(new InputStreamReader(System.in));

        int num, i = 1;

        System.out.println("Digite um número:");
        num = Integer.parseInt(in.readLine());

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }
    }
}
