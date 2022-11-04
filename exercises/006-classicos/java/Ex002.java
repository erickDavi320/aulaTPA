import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int idade,qUm = 0,qDois=0,qTres=0,qQuatro=0,qCinco=0,a=0, b=0,c=0,d=0,e=0;
        double qUP,qDP,qTP,qQP,qCP;
        for (int i = 1; i <=15;i++){
            System.out.print("Informe a idade:");
            idade = in.nextInt();
            if (idade<16){
                a++;
                qUm = a;
            }else if(idade<31){
                b++;
                qDois = b;
            }else if(idade<46){
                c++;
                qTres = c;
            }else if(idade<61){
                d++;
                qQuatro = d;
            }else {
                e++;
                qCinco = e;
            }
        }
        qUP = (qUm / 15.0)*1200;
        qDP = (qDois/15.0)*100;
        qTP = (qTres/15.0)*100;
        qQP = (qQuatro/15.0)*100;
        qCP = (qCinco/15.0)*100;
        System.out.println("A quantidade de pessoas na 1ª faixa etária e sua porcentagem é: ["+ qUm+"] e ["+qUP+"]");
        System.out.println("A quantidade de pessoas na 2ª faixa etária e sua porcentagem é: ["+ qDois+"] e ["+qDP+"]");
        System.out.println("A quantidade de pessoas na 3ª faixa etária e sua porcentagem é: ["+ qTres+"] e ["+qTP+"]");
        System.out.println("A quantidade de pessoas na 4ª faixa etária e sua porcentagem é: ["+ qQuatro+"] e ["+qQP+"]");
        System.out.println("A quantidade de pessoas na 5ª faixa etária e sua porcentagem é: ["+ qCinco+"] e ["+qCP+"]");

    }
}
