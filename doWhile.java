package loops;
import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o 
 zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, 
 que sejam positivos.*/
public class doWhile {
public static void main(String[] args) {
	int num, soma=0;
	
	Scanner ler = new Scanner(System.in);
	
	do {
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
		soma = soma + num;
	}while(num != 0);
	
	System.out.println("A soma dos números positivos é:" + soma);
}
}
