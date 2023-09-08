package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, 
inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via teclado 
1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado! 
Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */

public class Numeros2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num;

        Set <Integer> numeros = new HashSet<>();
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor");
            numeros.add(leia.nextInt());
        }
    
            System.out.println("Digite o número que deseja encontrar: ");
            num = leia.nextInt();
            if(numeros.contains(num)){
                System.out.println("Número " + num + " encontrado!");
            }else{
                System.out.println("O número " + num + " não foi encontrado.");
            }
        
        leia.close();
    }
}
