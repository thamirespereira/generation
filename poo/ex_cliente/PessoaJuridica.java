package poo.ex_cliente;

public class PessoaJuridica extends Cliente{
    public static void main(String[] args) {
        
    }
    String cnpj;

    public PessoaJuridica(String nome, int idade, String genero, String cidade, float totalCompras, String cnpj) {
        super(nome, idade, genero, cidade, totalCompras);
        this.cnpj = cnpj;
    }

    @Override
    public void Visualizar(){
        super.Visualizar();
        System.out.println("CNPJ: " + this.cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}
