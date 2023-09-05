package collections;
import java.util.ArrayList;
import java.util.Scanner;

/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
individualmente no ArrayList. Em seguida, faça o que se pede:
Mostre na tela todas as cores que foram adicionadas. 
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */

public class cores {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<>();

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma cor:");
            cores.add(leia.nextLine());
           
        } 
        System.out.println("Listar todas as cores: " + cores);

        cores.sort(null);
        System.out.print("Ordenar as cores: " + cores);

    
        leia.close();
        
    }
}
