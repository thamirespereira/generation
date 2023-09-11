package poo;

public class TestaGame {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("The sims", "simulacao", 2017, 132);
        Produto produto2 = new Produto("World of Warcraft", "MMORPG", 2014, 230);

        produto1.Visualizar();
        System.out.println("-----------------");
        produto2.Visualizar();
    }
}
