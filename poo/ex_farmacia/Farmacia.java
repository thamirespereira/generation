package poo.ex_farmacia;

public class Farmacia {
    public static void main(String[] args) {
        
    }
    String nomeProduto;
    Float preco;
    String validade;
    String categoria;
    int codigo;

    public Farmacia(String nomeProduto, Float preco, String validade, String categoria, int codigo) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.validade = validade;
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public void Visualizar(){
        System.out.println("Nome do produto: " + this.nomeProduto);
        System.out.println("\n Validade: " + this.validade);
        System.out.println("\n Preço: " + this.preco);
        System.out.println("\n Categoria: " + this.categoria);
        System.out.println("\n Codigo: " + this.codigo);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}

