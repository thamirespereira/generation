package poo;

public class Produto {
    String jogo;
    String genero;
    int ano;
    int preco;

    public Produto(String jogo, String genero, int ano, int preco) {
        this.jogo = jogo;
        this.genero = genero;
        this.ano = ano;
        this.preco = preco;
    }

    public void Visualizar(){
        System.out.println("Jogo: " + this.jogo);
        System.out.println("Genero: " + this.genero);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: " + this.preco);
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
}
