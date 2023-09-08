package loops;
import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o 
segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do 
programa. 
Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. */

public class Multiplos {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num1 = ler.nextInt();

        System.out.println("Digite um numero:");
        int num2 = ler.nextInt();

            if (num1 < num2) {
            for(int i = num1; i <= num2; i++){
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Número " + i + " é multiplo de 3 e 5");
                }
            }
            
        }else{
            System.out.println("Intervalo inválido.");
        }
        ler.close();
    }
}
