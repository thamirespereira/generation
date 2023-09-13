package poo.ex_ingresso;

public class TestarIngresso {
    public static void main(String[] args) {
        
       Ingresso ingresso1 = new Ingresso("Exo", "01/04/24", "21h", "Allianz parque", 340f);

       ingresso1.Visualizar();
       ingresso1.vender();
       ingresso1.metade();
       ingresso1.taxa();

    }
}
