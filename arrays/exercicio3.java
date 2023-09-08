package arrays;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        int matriz [][] = new int [3][3];
        int somaPrincipal = 0, somaSecundaria = 0;
        String diagonalPrincipal = "", diagonalSecundaria = "";

        Scanner leia = new Scanner(System.in);
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Digite a posição:" + i + "," + j);
                matriz[i][j] = leia.nextInt();
            }
        }
        for(int i = 0; i < matriz.length; i++){
            diagonalSecundaria += matriz[i][matriz.length - 1 - i] + ""; 
            somaPrincipal += matriz[i][i];
        }
        for(int i = 0; i < matriz.length; i++){
            diagonalSecundaria += matriz[i][matriz.length - 1 - i] + " ";
			somaSecundaria += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Elementos da diagonal principal: " + diagonalPrincipal);
        System.out.println("Elementos da diagonal secundária: " + diagonalSecundaria);
        System.out.println("Soma principal: " + somaPrincipal);
        System.out.println("Soma secundária: " + somaSecundaria);

        leia.close();
    }
}
