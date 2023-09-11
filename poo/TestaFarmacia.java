package poo;

public class TestaFarmacia {
    public static void main(String[] args) {
        
        Farmacia produto1 = new Farmacia("Protetor solar", 70f, "24 meses", "Beleza", 2399);
        Farmacia produto2 = new Farmacia("Dipirona", 5f, "12 meses", "Remedio", 3298);

        produto1.Visualizar();
        System.out.println("-----------------");
        produto2.Visualizar();
    }
}
