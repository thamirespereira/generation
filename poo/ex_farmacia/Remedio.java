package poo.ex_farmacia;

public class Remedio extends Farmacia{
    Boolean receita;
    
    public Remedio(String nomeProduto, Float preco, String validade, String categoria, int codigo, Boolean receita) {
        super(nomeProduto, preco, validade, categoria, codigo);
        this.receita = receita;
    }

    @Override
    public void Visualizar(){
        super.Visualizar();
        System.out.println("Receita: " + this.receita);
    }

    public Boolean getReceita() {
        return receita;
    }

    public void setReceita(Boolean receita) {
        this.receita = receita;
    }

    
}
