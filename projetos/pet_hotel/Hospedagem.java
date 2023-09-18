package projetos.pet_hotel;

public abstract class Hospedagem {

    private String nome;
    private int idade;
    private String especie;
    private String raca;
    private Float peso;
    private boolean vacina;
    private boolean castracao;
    private String tutor;
    private int numero;

    public Hospedagem(String nome, int idade, String especie, String raca, Float peso, boolean vacina, boolean castracao, String tutor, int numero) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
        this.peso = peso;
        this.vacina = vacina;
        this.castracao = castracao;
        this.tutor = tutor;
        this.numero = numero;
    }

    public void visualizar(){

        System.out.println("Nome do pet: " + this.nome);
        System.out.println("Idade: " + this.idade + " ano(s)");
        System.out.println("Especie:" + this.especie);
        System.out.println("Raca: " + this.raca);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Está com todas as vacinas em dia? " + this.vacina);
        System.out.println("É castrado? " + this.castracao);
        System.out.println("Nome do(a/e) tutor(a/e): " + tutor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public boolean isVacina() {
        return vacina;
    }

    public void setVacina(boolean vacina) {
        this.vacina = vacina;
    }

    public boolean isCastracao() {
        return castracao;
    }

    public void setCastracao(boolean castracao) {
        this.castracao = castracao;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

     public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}