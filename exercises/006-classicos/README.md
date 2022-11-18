# 006 - Classicos

## 1. Faça um programa que mostre as tabuadas dos números de 1 a 10

### Java

```java
public class Ex001 {

    public static void main(String[] args) {

        for (int i= 1;i<=10;i++){
            System.out.println("\nEssa é a tabuada do ["+ i +"]\n");
            for (int j = 1; j < 11; j++) {
                int v = i * j;
                System.out.println(i + " X " + j + " = "+ v);
            }
        }
    }
}
```

### Portugol

```jsx
programa TABUADA
var
	i, j, v: inteiro
inicio
	para i=1 até 10 passo 1 faça
		escreva("tabuada", i)
		para j=1 até 10 passo 1 faça
			v = i * j
			escreva(v)
		fim_para
	fim_para
fim
```

## 2. Faça um programa que receba a idade de 15 pessoas e mostre

- A quantidade de pessoas em cada faixa etária;
- A porcentagem de pessoas em cada faixa etária.


| FAIXA ETÁRIA | IDADE |
| --- | --- |
| 1ª | Até 15 anos |
| 2ª | De 16 a 30 anos |
| 3ª | De 31 a 45 anos |
| 4ª | De 46 a 60 anos |
| 5ª | Acima de 61 anos |

### Java

```java
import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int idade,qUm = 0,qDois=0,qTres=0,qQuatro=0,qCinco=0;
        double qUP,qDP,qTP,qQP,qCP;
        for (int i = 1; i <=15;i++){
            System.out.print("Informe a idade:");
            idade = in.nextInt();
            if (idade<16){
                qUm++;
            }else if(idade<31){
                qDois++;
            }else if(idade<46){
                qTres++;
            }else if(idade<61){
                qQuatro++;
            }else {
                qCinco++;
            }
        }
        qUP = (qUm / 15.0)*100;
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
```

### Portugol

```jsx
programa FAIXADEIDADE
var
	idade, qUm, qDois, qTres, qQuatro, qCinco, i: inteiro
	qUP, qDP, qTP, qQP, qCP: real
inicio
	
	qUm = 0
	qDois = 0
	qTres = 0
	qQuatro = 0
	qCinco = 0

	para i = 1 até 15 passo 1 faça
		leia(idade)
		se(idade < 16) então
			qUm = qUm + 1
		senão
			se(idade < 31) então
				qDois = qDois + 1
			senão
				se (idade < 46) então
					qTres = qTres + 1
				senão
					se (idade < 61) então
						qQuatro = qQuatro + 1
					senão
						qCinco = qCinco + 1
					fim_se
				fim_se
			fim_se
		fim_se
	fim_para
	qUP = (qUm / 15.0)*100;
  	qDP = (qDois / 15.0)*100;
  	qTP = (qTres / 15.0)*100;
  	qQP = (qQuatro / 15.0)*100;
  	qCP = (qCinco / 15.0)*100;
	
	escreva(qUm, qUP)
	escreva(qDois, qDP)
	escreva(qTres, qTP)
	escreva(qQuatro, qQP)
	escreva(qCinco, qCP)
fim
```

## 3. Criar um programa que leia um número inteiro e informe ao final se o número lido é primo ou não

### Java

```java
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
```

### Portugol

```jsx
programa PRIMOS
var
	num, check: inteiro
	primo: booleano
inicio
	primo = verdadeiro
	leia (num)	

	para check = 2 até num passo 1 faça
		se(num % 2 == 0) e (num != check) então
			primo = falso
		fim_se
	fim_para
	se(primo) então
		escreva("É primo")
	senão
		escreva("Não é primo")
	fim_se
fim
```

## 4. A série de Fibonacci é formada pela sequência

$$
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
$$

Crie um programa que imprima a série de Fibonacci até o enésimo termo, onde n (o número de termos) deverá ser informado pelo usuário.

### Java

```java
import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, atual = 1, anterior = 0;
		
		System.out.println("Digite a quantidade de termos da sequência fibonacci:");
		n = in.nextInt();
		
		for (int i = 0; i <= n; i++) {
			System.out.print(atual + " | ");
			atual += anterior;
			anterior = atual - anterior;
		}
		
	}

}
```

### Portugol

```jsx
programa FIBONACCI 
var
	n, atual, i, anterior: inteiro
inicio
	atual = 1
	anterior = 0
	leia(n)
	para i = 0 até n passo 1 faça
		escreva(atual)
		atual = atual + anterior
		anterior = atual - anterior
	fim_para
fim
```

## 5. Criar um programa que receba a idade de 10 pessoas. Calcule e mostre

- A média das idades das pessoas;
- A idade da pessoa mais jovem;
- A idade da pessoa mais velha.

### Java

```java
import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age, average = 0, newest = 999, older = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nDigite a idade da " + i + "ª pessoa:");
            age = in.nextInt();

            if(age < newest) {
                newest = age;
            }
            if(age > older) {
                older = age;
            }
            average += age;
        }
        System.out.println("O usuário mais velho tem " + older + " anos.");
        System.out.println("O usuário mais novo tem " + newest + " anos.");
        System.out.println("A média das idades é: " + (average / 10));
    }
}
```

### Portugol

```jsx
programa MEDIAIDADES
var
	age, average, newest, older, i : inteiro
inicio
	average = 0
	newest = 999
	older = 0
	para i = 1 até 10 passo 1 faça
		leia(age)
		se(age < newest) então
			newest = age
		fim_se
		se(age > older) então
			older = age
		fim_se
		average = average + age
	fim_para
	escreva("Mais velho: "older)
	escreva("Mais novo: ", newest)
	escreva("Média: ", (average / 10))
fim
```
