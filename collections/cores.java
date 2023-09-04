package collections;
import java.util.ArrayList;
import java.util.Scanner;

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
