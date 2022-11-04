import java.io.*;
import java.time.LocalDate;

public class Ex002 {

    public static void main(String[] args) throws IOException {

        LocalDate localdate = LocalDate.now();
        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        int year;
        int older = 0, newest = 300;

        try {
            year = localdate.getYear();
        } catch (Exception e) {
            System.out.println("Digite o ano atual:");
            year = Integer.parseInt(in.readLine());
        }

        System.out.println("O ano atual é " + year);
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nDigite ao ano de nascimento do " + i + "º usuário:");

            // Read user year birth and calculate age
            int current = year - Integer.parseInt(in.readLine());

            if (current > older) {
                older = current;
            }

            if (current < newest) {
                newest = current;
            }

        }

        System.out.println("\nO mais velho tem " + older + " anos de idade.");
        System.out.println("O mais velho tem " + newest + " anos de idade.");
    }
}
