import java.util.Scanner;

public class Ex003 {

	/*total alunos---100%
	 * total nota----?%*/
	/*(total nota*100)/total alunos = X
	 * X = porcentagem final*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int porcento,totalA,mb,b,r,i;
		String mencao;
		System.out.println("informe a quantidade de alunos: " );
		totalA = ler.nextInt();
		System.out.println("quantos alunos tiveram a menção I: ");
		i = ler.nextInt();
		System.out.println("quantos alunos tiveram a menção R: ");
		r = ler.nextInt();
		System.out.println("quantos alunos tiveram a menção B: ");
		b = ler.nextInt();
		System.out.println("quantos alunos tiveram a menção MB?");
		mb = ler.nextInt();
		System.out.println("De qual menção gostaria de ver a porcentagem: [I,R,B,MB]");
		mencao = ler.next();
		switch (mencao){
		case "I":
		case "i":
			porcento = (i*100)/totalA; 
			System.out.println("Essa é a porcentagem de alunos com essa menção: "+porcento+"%");
		break;
		case "R":
		case "r":
			porcento = (r*100)/totalA;
			System.out.println("Essa é a porcentagem de alunos com essa menção: "+porcento+"%");
		break;
		case "B":
		case "b":
			porcento = (b*100)/totalA;
			System.out.println("Essa é a porcentagem de alunos com essa menção: "+porcento+"%");
		break;
		case "MB":
		case "mb":
			porcento = (mb*100)/totalA;
			System.out.println("Essa é a porcentagem de alunos com essa menção: "+porcento+"%");
		break;
		}
		ler.close();
	}
}
