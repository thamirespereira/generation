package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e 
adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. */

public class Numeros {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        Set<Integer> setNumeros = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            setNumeros.add(leia.nextInt());
        }
        Iterator <Integer> iterator = setNumeros.iterator();
        while (iterator.hasNext()) {
            System.out.println("Listar dados do Set: " + iterator.next());
        }
        leia.close();
    }
}
