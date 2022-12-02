import java.util.Scanner;

public class teeeeste_Final {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int TAM = 3;
		double a[], b[];
		int i;
		
		a = new double [TAM];
		b = new double [TAM];
		 
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o " + (i+1) + "º valor:");
			a[i] = in.nextInt();
			
			b[i] = Math.sqrt(a[i]);
		}
		in.close();
		
		for(i=0;i<TAM;i++) {
			System.out.println("A raíz quadrada de " + String.format("%.2f", a[i]) + " é: " + String.format("%.2f", b[i]) );
		}
		
	}
}
