package poo.ex_farmacia;

import java.util.InputMismatchException;

public class TestaFarmacia {
    public static void main(String[] args) {

        try {
        Remedio remedio1 = new Remedio("Bromoprida", 23.00f, "12 meses", "Genérico", 4345, true);
        Remedio remedio2 = new Remedio("Dipirona", 5.00f, "12 meses", "Analgésico", 3244, false);

        Perfumaria produto1 = new Perfumaria("Lip balm", 22.00f, "24 meses", "Hidratante labial", 5963, "10%");
        Perfumaria produto2 = new Perfumaria("Protetor solar 50 fps", 70.00f, "12 meses", "Protetor solar", 5453, "50%");

        System.out.println("Remédios: ");
        System.out.println("-----------------");
        remedio1.Visualizar();
        System.out.println("-----------------");
        remedio2.Visualizar();
        System.out.println("-----------------");
        
        System.out.println("\n Perfumaria: ");
        System.out.println("-----------------");
        produto1.Visualizar();
        System.out.println("-----------------");
        produto2.Visualizar();

        } catch (InputMismatchException e) {
            System.err.println("Excecao: " + e);
            System.out.println("Digite um dado válido");
        }
        
        
    }
}
