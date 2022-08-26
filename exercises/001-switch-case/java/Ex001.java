/*
    1-Uma escola de futebol classifica seus alunos da seguinte forma:
        • Alunos de 6 anos são categoria “dente de leite”
        • Alunos de 7 anos são categoria “júnior”
        • Alunos de 8 anos são categoria “júnior max”
        • Alunos de 9 anos são categoria “júnior master”
        • Alunos de 10 anos são categoria “master”
*/

import java.io.*;

public class Ex001 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new
                BufferedReader(new InputStreamReader(System.in));

        int age;
        String category = "", result;
        boolean status = true;

        System.out.println("Digite a sua idade:");
        age = Integer.parseInt(in.readLine());

        switch (age) {
            case 6  -> category    = "dente de leite";
            case 7  -> category    = "júnior";
            case 8  -> category    = "júnior max";
            case 9  -> category    = "júnior master";
            case 10 -> category    = "master";
            default -> status       = false;
        }

        result = (status)
                ? "A sua categoria é " + category
                :"A sua faixa de idade não é atendida. :/";

        System.out.println(result);
    }
}
