package collections;

import java.util.ArrayList;
import java.util.Scanner;

/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, 
inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via teclado 
1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número na Collection. 
Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */

public class encontrarNumero {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int num;

        ArrayList <Integer> numeros = new ArrayList<>();
        //adiciona valores ao arraylist
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor:");
            numeros.add(leia.nextInt());
        }

        System.out.println("Digite um número que deseja encontrar: ");
        num = leia.nextInt();
        if(numeros.contains(num)){
            System.out.println("Número " + num + " encontrado!");
        }else{
            System.out.println("O número " + num + " não foi encontrado.");
        }

        leia.close();
    }
}
