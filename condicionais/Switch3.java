package condicionais;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite um numero: ");
	int numeroUm = leia.nextInt();
	
	System.out.println("Digite um numero: ");
	int numeroDois = leia.nextInt();
	
	System.out.println("Digite um numero: ");
	int opcao = leia.nextInt();
	
	int soma, subtracao, divisao, multiplicacao;
	
	soma = numeroUm + numeroDois;
	subtracao = numeroUm - numeroDois;
	divisao = numeroUm / numeroDois;
	multiplicacao = numeroUm * numeroDois;
	
	switch(opcao) {
	case 1:
		System.out.println(soma);
		break;
	case 2:
		System.out.println(subtracao);
		break;
	case 3:
		System.out.println(divisao);
		break;
	case 4:
		System.out.println(multiplicacao);
		break;
	default:
		System.out.println("Opção invalida");
	}
    leia.close();
    }
}
