package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestarFuncionario {
 
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario(null, null, null, 0, 0);
		
		Funcionario funcionario2 = new Funcionario(null, null, null, 0, 0);
	
		Scanner ler = new Scanner(System.in);

		try {
		//funcionario 1
		System.out.println("Nome: ");
		funcionario1.setNome(ler.nextLine());
		
		System.out.println("Genero: ");
		funcionario1.setGenero(ler.nextLine());
		
		System.out.println("Cargo: ");
		funcionario1.setCargo(ler.nextLine());
		
		System.out.println("Idade: ");
		funcionario1.setIdade(ler.nextInt());
		
		System.out.println("Salario: ");
		funcionario1.setSalario(ler.nextInt());
		
		//funcionario 2
		
		System.out.println("Nome: ");
		funcionario2.setNome(ler.nextLine());
		
		System.out.println("Genero: ");
		funcionario2.setGenero(ler.nextLine());
		
		System.out.println("Cargo: ");
		funcionario2.setCargo(ler.nextLine());
		
		System.out.println("Idade: ");
		funcionario2.setIdade(ler.nextInt());
		
		System.out.println("Salario: ");
		funcionario2.setSalario(ler.nextInt());
	
		funcionario1.Visualizar();
		System.out.println("-----------------------------------");
		funcionario2.Visualizar();
		
		} catch (InputMismatchException e) {
			System.err.println("\nExcecao: " + e);
			ler.nextLine();
			System.out.println("\nDigite um dado válido!");
		}
	
		
		
		ler.close();
    }
}


