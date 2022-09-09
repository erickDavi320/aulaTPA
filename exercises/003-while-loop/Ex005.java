import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i=1;
        int base, expoente, potencia = 1;

        System.out.println("Insira a base: ");
        base = ler.nextInt();
        System.out.println("Insira o expoente: ");
        expoente = ler.nextInt();
        ler.close();

        while (i<=expoente){
            potencia = potencia * base;
            i++;
        }

        System.out.println("A potência é: "+potencia);

    }
}
