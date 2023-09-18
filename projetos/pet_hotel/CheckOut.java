package projetos.pet_hotel;

public class CheckOut extends Hospedagem{

    private Float pagamento;

    public CheckOut(String nome, int idade, String especie, String raca, Float peso, boolean vacina, boolean castracao,
            String tutor, Float pagamento) {
        super(nome, idade, especie, raca, peso, vacina, castracao, tutor, idade);
        this.pagamento = pagamento;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Check-out realizado com sucesso!");
    }

    public Float getPagamento() {
        return pagamento;
    }

    public void setPagamento(Float pagamento) {
        this.pagamento = pagamento;
    }
    
}
