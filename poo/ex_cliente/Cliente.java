package poo.ex_cliente;

public class Cliente {

    public static void main(String[] args) {
    }

    
    private String nome;
    private int idade;
    private String genero;
    private String cidade;
    private float totalCompras;

    public Cliente(String nome, int idade, String genero, String cidade, float totalCompras) {
        this.idade = idade;
        this.nome = nome;
        this.genero = genero;
        this.cidade = cidade;
        this.totalCompras = totalCompras;
    }
    
    public void Visualizar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Valor total das compras: " + this.totalCompras);
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
