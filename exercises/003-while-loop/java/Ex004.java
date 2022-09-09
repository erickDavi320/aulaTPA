import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, fatorial = 1;
        System.out.println("Insira um número à ser fatorado: ");
        i = ler.nextInt();
        while (i>0){
            fatorial = fatorial * i;
            i--;
        }
        System.out.println("O fatorial é: " + fatorial);
        ler.close();
    }

}
