package variaveis;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
	float n1, n2, n3, n4, calculo;
	
	System.out.println("n1: ");
	n1 = leia.nextFloat();
	
	System.out.println("n2: ");
	n2 = leia.nextFloat();
	
	System.out.println("n3: ");
	n3 = leia.nextFloat();
	
	System.out.println("n4: ");
	n4 = leia.nextFloat();
	
	calculo = (n1 * n2) - (n3 * n4);
	System.out.println("calculo: " + calculo);

    leia.close();
    }
}
