package condicionais;

import java.util.Scanner;

/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade 
 * entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um 
 * Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade 
 * (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras 
 * para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
 */
public class ExercicioIf3 {
    public static void main(String[] args) {
        String nome;
		int idade;
		Boolean primeira;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome:");
		nome = leia.nextLine();
		
		System.out.println("Idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira vez?");
		primeira = leia.nextBoolean();
		
		if(idade > 60 && idade < 69) {
			if(primeira == false) {
				System.out.println(nome + " Pode doar.");
			}else {
				System.out.println(nome + " Não pode doar.");
			}
		}
		if(idade > 18 && idade < 60) {
			System.out.println(nome + " Pode doar");
		}
        leia.close();
	}
    }

