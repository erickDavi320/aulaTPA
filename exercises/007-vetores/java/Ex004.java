import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		final int TAM = 10;
		int i, menor = 999999,maior = 0,a[];
		
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.print("Informe um valor: ");
			a[i] = in.nextInt();
			
			if(a[i] > maior) {
				maior = a[i];
			}else {
				menor = a[i];
			}
			
			in.close();
			
			System.out.println("Menor valor: " + menor);
			System.out.println("Maior valor: " + maior);
		}
		
	}

}
