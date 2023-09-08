package condicionais;
/*Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na 
 * tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo 
 * ou negativo.
 */
import java.util.Scanner;

public class ExercicioIf2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int num = leia.nextInt();
	
	if(num % 2 == 0) {
		System.out.println("Numero par");
	}else {
		System.out.println("Numero impar");
	}

    leia.close();
    }
}
