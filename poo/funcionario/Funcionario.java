package poo.funcionario;

public class Funcionario extends Pessoa implements Gerente, Vendedor{
    public static void main(String[] args) {
        
    }
    public Funcionario (String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void coordenar(){
        System.out.println("O departamento coordena os fucionários.");
    }

    @Override
    public void gerenciar(){
        System.out.println("Gerencia os processos de venda.");
    }

    @Override
    public void vender(){
        System.out.println("Vende.");
    }
}

