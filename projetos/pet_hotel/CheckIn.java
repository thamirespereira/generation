package projetos.pet_hotel;

public class CheckIn extends Hospedagem{

    private String cadastro;
    private int gerarNumero;
    private int idade;
    private String especie;
    private String raca;
    private int peso;
    private boolean vacina;
    private boolean castracao;
    private String tutor;

    public CheckIn(String nome, int idade, String especie, String raca, Float peso, boolean vacina, boolean castracao,
            String tutor, int numero, String cadastro, int gerarNumero) {
        super(nome, idade, especie, raca, peso, vacina, castracao, tutor, numero);
        this.cadastro = cadastro;
        this.gerarNumero = gerarNumero;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca2;
        this.peso = peso;
        this.vacina = vacina;
        this.castracao = castracao;
        this.tutor = tutor;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Check-in realizado com sucesso!");
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    
}
