package poo.ex_cliente;

public class PessoaFisica extends Cliente{
    public static void main(String[] args) {
       
    }
    String cpf;

    public PessoaFisica( String nome, int idade,String genero, String cidade, float totalCompras, String cpf) {
        super( nome, idade, genero, cidade, totalCompras);
        this.cpf = cpf;
    }

    @Override
    public void Visualizar(){
        super.Visualizar();
        System.out.println("CPF: " + this.cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
