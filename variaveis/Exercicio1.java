package variaveis;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
		
		float salario, abono,  novoSalario;
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo salário: " + novoSalario);

        leia.close();
    }
}
