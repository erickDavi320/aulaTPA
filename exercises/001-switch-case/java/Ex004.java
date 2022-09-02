/*
    4- A cantina da escola decidiu criar um programa que facilite a consulta de preços dos itens disponíveis para venda. Com
    isso, colocou um computador para uso dos alunos em que a qualquer momento, de posse do código de um produto, eles
    possam ser informados de sua descrição e valor. Criar o programa em que o aluno informe o código do produto e receba
    como saída a descrição do produto e o seu valor conforme tabela abaixo:
    Código  | Descrição         | Valor
    1       | Cachorro quente   | R$ 8,00
    2       | Cheeseburger      | R$ 12,00
    3       | X-Salada          | R$ 15,00
    4       | Misto Quente      | R$ 11,00
    5       | Pão na chapa      | R$ 6,00
*/

import java.io.*;

public class Ex004 {

    public static final String[] descricao = {"Cachorro Quente", "Cheeseburger", "X-Salada", "Misto Quente", "Pão na Chama"};
    public static final Double[] price = {8.00, 12.00, 15.00, 11.00, 6.00};
    public static Integer code;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new
                BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite o código do produto:");

        switch (Integer.parseInt(in.readLine())) {
            case 1 -> setCode(1);
            case 2 -> setCode(2);
            case 3 -> setCode(3);
            case 4 -> setCode(4);
            case 5 -> setCode(5);
            default -> System.out.println("Número Inválido! Tente Novamente");
        }
        if (getCode() != null) {
            System.out.println(apresentar());
        }
    }
    public static String apresentar() {
        int code = getCode() - 1;
        return (descricao[code] + " - R$ " + price[code]);
    }

    public static Integer getCode() {
        return code;
    }

    public static void setCode(Integer code) {
        Ex004.code = code;
    }
}
