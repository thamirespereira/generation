package loops;
import java.util.Scanner;
 
/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na
 *  tela quantos números são pares e quantos número são ímpares.*/
 
public class imparPar {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	int contador, num;
	int par = 0;
	int impar = 0;
	
	for(contador = 1; contador < 10; contador++) {
	System.out.println("Digite um numero: ");
	num = ler.nextInt();
	
	if (num % 2 == 0) {
		par++;
	} else {
		impar++;
	}
	}
	System.out.println("Total numeros pares: " + par);
	System.out.println("Total numeros impares: " + impar);
}
}
	


