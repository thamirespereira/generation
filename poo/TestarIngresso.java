package poo;

public class TestarIngresso {
    public static void main(String[] args) {
        
        Ingresso ingresso1 = new Ingresso("Twice", "20/01/24", "21h", "Allianz Parque", 500f);
        Ingresso ingresso2 = new Ingresso("Stray Kids", "25/10/2024", "21h", "Maracanã", 650f);

        ingresso1.Visualizar();
        System.out.println("------------------");
        ingresso2.Visualizar();
    }
}
