import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num;
		boolean primo = true;
		
		System.out.print("Informe o valor a ser testado:");
		num = in.nextInt();
		
		for(int check = 2;check <= num; check++) {
			if(num % check == 0 && num != check){
				primo = false;
			}
		}
		if(primo){
			System.out.println("O número ["+num+"] É primo :D");
		}else {
			System.out.println("O número ["+num+"] NÃO É primo ;-;");
		}
		
		in.close();
	}

}
