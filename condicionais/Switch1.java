package condicionais;

import java.util.Scanner;

/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um 
 * item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
 * A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
 */
public class Switch1 {
    public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);

	int item; 
	int quantidade;
	Double preco1 = 10.00;
	Double preco2 = 15.00;
	Double preco3 = 18.00;
	Double preco4 = 12.00;
	Double preco5 = 8.00;
	Double preco6 = 13.00;
	
	System.out.println("1 - Cachorro quente - R$10,00");
	System.out.println("2 - X-Salada - R$15,00");
	System.out.println("3 - X-Bacon - R$18,00");
	System.out.println("4 - Bauru - R$12,00");
	System.out.println("5 - Refrigerante - R$8,00");
	System.out.println("6 - Suco de laranja - R$13,00");
	
	System.out.println("Item: ");
	item = leia.nextInt();
	
	System.out.println("Quantidade: ");
	quantidade = leia.nextInt();
	
	switch(item) {
	case 1:
		System.out.println(quantidade + " Cachorro Quente");
		System.out.println("R$" + (quantidade * preco1));
		break;
	case 2:
		System.out.println(quantidade + " X-Salada");
		System.out.println("R$" + (quantidade * preco2));
		break;
	case 3:
		System.out.println(quantidade + " X-Bacon");
		System.out.println("R$" + (quantidade * preco3));
		break;
	case 4:
		System.out.println(quantidade + " Bauru");
		System.out.println("R$" + (quantidade * preco4));
		break;
	case 5:
		System.out.println(quantidade + " Refrigerante");
		System.out.println("R$" + (quantidade * preco5));
		break;
	case 6:
		System.out.println(quantidade + " Suco de laranja");
		System.out.println("R$" + (quantidade * preco6));
		break;
	}
    leia.close();
    }
}
