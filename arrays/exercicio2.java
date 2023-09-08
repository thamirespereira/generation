package arrays;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int vetor [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        Scanner leia = new Scanner(System.in);
        System.out.println("2, 5, 1, 3, 4, 9, 7, 8, 10, 6");
        System.out.println("Digite um número para saber a posição: ");
        int numero = leia.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == numero) {
                System.out.println("A posição do número digitado é: " + i);
            }
        }
        leia.close();
    }
}
