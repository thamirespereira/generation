package loops;
import java.util.Scanner;

 /*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
  * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos
  *  e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve
  *   ser finalizada ao digitar uma idade negativa
  */
public class Idade {
public static void main(String[] args) {
	
	int idade = 1, menor21 = 0, maior50 = 0;
	
	Scanner ler = new Scanner(System.in);
	
	while(idade > 0) {
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade < 21) {
			menor21++;
		}else if(idade > 50){
			maior50++;
		}
		
	}
	System.out.println("Total de pessoas menores de 21 anos:" + menor21);
	System.out.println("Total de pessoas maiores de 50 anos:" + maior50);
}
}
