import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int resposta,anoAtual,anoNasc,idade;
		do {
			System.out.println("informe o ano Atual: ");
			anoAtual = ler.nextInt();

			System.out.println("informe o ano de seu Nascimento");
			anoNasc = ler.nextInt();

			idade = anoAtual - anoNasc;
			System.out.println(idade)
            
			if(idade <18){
				System.out.println(idade+" Você é menor de idade!");
			}else {
				System.out.println(idade+" Você é maior de idade!");
			}
			System.out.println("Deseja continuar o programa? 1-Sim e 2-Não");
			resposta = ler.nextInt();
		}while(resposta == 1);
	}

}