# Lista complementar de TPA

Treinamento para trabalhar com vetores

## 1. Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares

### Java

```Java
import java.io.*;

public class Ex001 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new 
                BufferedReader(new InputStreamReader(System.in));

        final int TAM = 20;
        int[] a = new int[TAM];
        int[] b = new int[TAM];

        int contPar = 0;
        int contImpar = TAM - 1;

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "o. elemento:");
            a[i] = Integer.parseInt(in.readLine());

            if (a[i] % 2 == 0) {
                b[contPar] = a[i];
                contPar++;
            } else {
                b[contImpar] = a[i];
                contImpar--;
            }
        }

        System.out.print("\nElementos Pares:\nPAR: ");
        for (int i = 0; i < contPar; i++) {
            System.out.print(b[i] + " | ");
        }
        System.out.print("\nElementos Impares:\nIMPAR: ");
        for (int i = TAM - 1; i >= contPar; i--) {
            System.out.print(b[i] + " | ");
        }

        System.out.println("\nVetor B:");
        for (int i : b) {
            System.out.print(i + " | ");
        }

    }
}
```

## 2. Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A

### Java

```Java
import java.io.*;

public class Ex002 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new 
                BufferedReader(new InputStreamReader(System.in));

        final int TAM = 5;
        int[] a = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "o. elemento da lista:");
            a[i] = Integer.parseInt(in.readLine());
        }

        for (int k : a) {

            System.out.println("\nTABUADA DO " + k + " :");

            for (int j = 1; j <= 10; j++) {
                System.out.println(k + " x " + j + " = " + (k * j));
            }
        }

    }
}
```

## 3. Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não

### Java

```Java
import java.io.*;

public class Ex003 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = 
                new BufferedReader(new InputStreamReader(System.in));

        final int TAM = 10;
        int[] a = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "o. elemento do vetor:");
            a[i] = Integer.parseInt(in.readLine());
        }

        for (int i : a) {
            System.out.println(i + " primo = " + isPrimo(i));
        }
    }

    public static boolean isPrimo(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 4. Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os pares de 0 até o respectivo elemento

### Java

```Java

```

## 5. Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os divisores do respectivo elemento

### Java

```Java

```

## 6. Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo elemento, ou seja: A[i] = 2i

### Java

```Java

```

## 7. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento correspondente em A

### Java

```Java

```

## 8. Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento de B deverá ser o seguinte somatório: Bi = Somatório de Aj, para todo j variando de i até 10

### Java

```Java

```

## 9. Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um programa que realize a intersecção dos vetores A e B para produzir um vetor C. Interseção de conjuntos = todos os elementos que existem em A e também existem em B

### Java

```Java

```

## 10. Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um programa que crie um vetor C que é a diferença dos conjuntos formados pelos elementos dos vetores A e B. Diferença de conjuntos = todos os elementos do conjunto A que não existem no conjunto B

### Java

```Java

```

## 11. Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, para pesquisar se um dado elemento X está armazenado em A

### Java

```Java

```

## 12. Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo

### Java

```Java

```

## 13. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 quando Ai for ímpar

### Java

```Java

```

## 14. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Ci deverá receber 1quando Ai for maior que Bi; b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 quando Ai for menor que Bi

### Java

```Java

```

## 15.  Ler um vetor A com dez elementos inteiros. Criar um vetor B que tenha os 10 elementos de A em ordem crescente e um vetor C que tenha os 10 elementos de A em ordem descrescente

### Java

```Java

```
