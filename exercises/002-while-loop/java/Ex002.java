/*
    2- Criar  um  programa  que  calcule  e  apresente  a  tabuada  de  um  número inteiro  digitado  pelo usuário.
 */

package apos001;

import java.util.Scanner;

public class Ex002 {

    public static Scanner in;

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int tabuada, i = 1;

        System.out.println("Digite a tabuada que você quer ver:");
        tabuada = in.nextInt();
        in.close();
        while(i <= 10) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i) );
            i++;
        }

    }
}
