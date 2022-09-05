import java.util.Scanner;

public class Proj_Um {

	public static void main(String[] args) {
		int mes,dia;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe o mês de nascimento: ");
		mes = ler.nextInt();
		System.out.println("informe o dia de nascimento: ");
		dia = ler.nextInt();
		switch (mes) {
			case 1:
				if (dia<=19){
					System.out.println("Capricorniano");
				}else if (dia>19 && dia<32){
					System.out.println("Aquariano");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 2:
				if (dia<19) {
					System.out.println("Aquariano");
				}else if(dia>=20 && dia<29) {
					System.out.println("Pisciano");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 3:
				if (dia<21) {
					System.out.println("Pisciano");
				}else if(dia>20 && dia<32) {
					System.out.println("Ariano");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 4:
				if (dia<21) {
					System.out.println("Ariano");
				}else if(dia>=21 && dia<31) {
					System.out.println("Taurino");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 5:
				if (dia<21) {
					System.out.println("Taurino");
				}else if(dia>=21 && dia<32) {
					System.out.println("Geminiano");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 6:
				if (dia<21) {
					System.out.println("Geminiano");
				}else if(dia>=21 && dia<31) {
					System.out.println("Canceriano");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 7:
				if (dia<23) {
					System.out.println("Canceriano");
				}else if(dia>=23 && dia<32) {
					System.out.println("Leonino");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 8:
				if (dia<23) {
					System.out.println("Leonino");
				}else if(dia>=23 && dia<32) {
					System.out.println("Virgem");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 9:
				if (dia<23) {
					System.out.println("Virgem");
				}else if(dia>=23 && dia<31) {
					System.out.println("Libra");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 10:
				if (dia<23) {
					System.out.println("Libra");
				}else if(dia>=23 && dia<32) {
					System.out.println("Escorpião");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 11:
				if (dia<22) {
					System.out.println("Escorpião");
				}else if(dia>=22 && dia<31) {
					System.out.println("Sagitáriano");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			case 12:
				if (dia<22) {
					System.out.println("Sagitáriano");
				}else if(dia>=22 && dia<32) {
					System.out.println("Cápricorniano");
				}else {
					System.out.println("esse dia não é válido!");
				}
				break;
			default :
				System.out.println("Esse mês não é válido!");
		}
		ler.close();
	}

}
