package poo.ex_farmacia;

public class Perfumaria extends Farmacia{
    public static void main(String[] args) {
        
    }

    String desconto;

    public Perfumaria(String nomeProduto, Float preco, String validade, String categoria, int codigo, String desconto) {
        super(nomeProduto, preco, validade, categoria, codigo);
        this.desconto = desconto;
    }

    @Override
    public void Visualizar(){
        super.Visualizar();
        System.out.println("Desconto: " + this.desconto);
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }
}
