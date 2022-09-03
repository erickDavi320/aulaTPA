/*
    4- Criar um programa que leia o preço de um produto e a margem de lucro (emporcentagem). Calcule e apresente o preço de venda. Executar esse programa até que o usuário responda ‘N’ para a pergunta (‘Deseja continuar a execução? (S/N) ‘).
*/

package apos001;

import java.util.Scanner;

public class Ex004 {

    public static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        double preco, precoVenda, margem = 0;

        while (true) {

            System.out.println("Digite o preço do produto:");
            preco = in.nextDouble();
            System.out.println("Digite a sua margem de lucro (em porcentagem):");
            try {
                   margem = in.nextDouble();
            } catch (Exception e) {
                System.out.println("Número inválido.");
                break;
            }

            precoVenda = preco + (preco * margem)/ 100;
            System.out.println("O preço de venda é: R$ " + precoVenda);

            System.out.println("Deseja continuar? [S/n]");
            char res = in.next().toLowerCase().charAt(0);
            if (res == 's') {
                System.out.println("Ok.");
            } else {
                break;
            }
        }

        in.close();

    }

}
