import java.util.Scanner;

public class Ex012 {
	
	public static Scanner in;
	
	public static void main(String[] args) {
	
		in = new Scanner(System.in);
		
		final int TAM = 10;
		int[] a = new int[TAM];
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i+1) + "o. elemento:");
			a[i] = in.nextInt();
		}
		
		for (int i : a) {
			System.out.print(i + " | ");
		}
		System.out.println("\nPalindromo = " + isPalindromo(a));
		
	}
	
	
	public static boolean isPalindromo(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] != a[a.length - 1 - i]) {
				return false;
			}
		}
		
		return true;
	}

}
