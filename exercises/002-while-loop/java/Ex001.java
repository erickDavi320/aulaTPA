import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1;
		double s,d;
		while (i<5) {
			System.out.println("informe o salário: ");
			s = ler.nextDouble();
			if(s<2000) {
				d = (8.5/100)*s;
				System.out.println("o INSS fica: "+d);
			}else {
				d = (11.0/100)*s;
				System.out.println("o INSS fica: "+d);
			}
			i++;
		}
		ler.close();
	}
}
