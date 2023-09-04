package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class numeros {
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
