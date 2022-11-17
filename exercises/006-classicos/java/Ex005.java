
import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age, average = 0, newest = 999, older = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nDigite a idade da " + i + "ª pessoa:");
            age = in.nextInt();

            if(age < newest) {
                newest = age;
            }
            if(age > older) {
                older = age;
            }
            average += age;
        }
        System.out.println("O usuário mais velho tem " + older + " anos.");
        System.out.println("O usuário mais novo tem " + newest + " anos.");
        System.out.println("A média das idades é: " + (average / 10));
    }
}