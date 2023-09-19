package projetos.pet_hotel;

public class CheckIn extends Hospedagem{

    public CheckIn(String nome, int idade, String especie, String raca, Float peso, boolean vacina, boolean castracao,
            String tutor, int numero) {
        super(nome, idade, especie, raca, peso, vacina, castracao, tutor, numero);
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Check-in realizado com sucesso!");
    }

    
}
