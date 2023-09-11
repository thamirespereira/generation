package poo;

public class Cliente {

    public static void main(String[] args) {
    }

    private int idade;
    private String nome;
    private String genero;
    private String cidade;
    private float totalCompras;

    public Cliente(int idade, String nome, String genero, String cidade, float totalCompras) {
        this.idade = idade;
        this.nome = nome;
        this.genero = genero;
        this.cidade = cidade;
        this.totalCompras = totalCompras;
    }
    
    public void Visualizar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("\n Idade: " + this.idade);
        System.out.println("\n Gênero: " + this.genero);
        System.out.println("\n Cidade: " + this.cidade);
        System.out.println("\n Valor total das compras: " + this.totalCompras);
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public float getTotalCompras() {
        return totalCompras;
    }
    public void setTotalCompras(float totalCompras) {
        this.totalCompras = totalCompras;
    }
}
