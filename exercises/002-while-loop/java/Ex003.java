import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id,idVelho=1,idNovo=199,i=1;
		String nome,nomeVelho="",nomeNovo="";
		while (i<=10) {
			System.out.println("informe o nome do usuario"+i+": ");
			nome = ler.next();
			System.out.println("entre com a "+i+" idade:");
			id = ler.nextInt();
			if (id<idNovo) {
				idNovo = id;
				nomeNovo = nome;
			}else if (id>idVelho) {
				idVelho = id;
				nomeVelho = nome;
			}
			i++;
		}
		System.out.println("O nome do mais velho "+nomeVelho+" com "+idVelho+" anos");
		System.out.println("O nome do mais novo "+nomeNovo+" com "+idNovo+" anos");
		
		ler.close();
	}

}