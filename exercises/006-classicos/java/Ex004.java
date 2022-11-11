import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, atual = 1, anterior = 0;
		
		System.out.println("Digite a quantidade de termos da sequência fibonatti:");
		n = in.nextInt();
		
		for (int i = 0; i <= n; i++) {
			System.out.print(atual + " | ");
			atual += anterior;
			anterior = atual - anterior;
		}
		
	}

}
