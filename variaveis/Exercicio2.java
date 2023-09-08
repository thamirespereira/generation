package variaveis;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Nota 3: ");
		nota3 = leia.nextFloat();
				
		System.out.println("Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = nota1 + nota2 + nota3 + nota4 / 4;
		System.out.println("Média: " + media);

        leia.close();
    }
}
