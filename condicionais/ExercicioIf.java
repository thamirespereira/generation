package condicionais;

import java.util.Scanner;

/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela 
 * se a soma de A + B é maior, menor ou igual a C.
 */

public class ExercicioIf {
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
	int A, B, C, soma;
	
	System.out.println("Digite o número A: ");
	A = leia.nextInt();
	
	System.out.println("Digite o número B: ");
	B = leia.nextInt();
	
	System.out.println("Digite o número C: ");
	C = leia.nextInt();
	
	soma = A + B;
	
	if (soma > C) {
	System.out.println(A + "+" + B + "=" + soma + ">" + C);
	System.out.println("A soma de A e B é maior que C");
	}
	else if (soma < C) {
		System.out.println(A + "+" + B + "=" + soma + "<" + C);
		System.out.println("A soma de A e B é menor que C");
	}else {
		System.out.println(A + "+" + B + "=" + soma + "=" + C);
		System.out.println("A soma de A e B é igual que C");
			}

        leia.close();
}
    
}
    
