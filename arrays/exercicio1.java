package arrays;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        int vetor [] = new int[10];
        int soma = 0;
        int par = 0;
        int impar =0;
        Scanner leia = new Scanner(System.in);

        for(int indice = 0; indice < 10; indice++){
            System.out.println("Digite um número:");
            vetor[indice] = leia.nextInt();
            if (indice % 2 != 0) {
                    impar++;
                }
                }

            for (int i : vetor) {
                if (vetor[i]%2==0) {
                 par++;
            }}

            for (Integer i : vetor) {
                soma += i.intValue();
            } 
            System.out.println("Elementos nos indices ímpares:" + impar);

            System.out.println("Elementos do vetor que são números pares: " + par);

            System.out.println("Soma de todos os elementos do vetor: " + soma);
        
            System.out.println("Média de todos os elementos do vetor: " + (soma/10));

            leia.close();
        }
        
        
    }

