package poo.ex_cliente;

import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        PessoaFisica pessoaFisica1 = new PessoaFisica( "Lana",34, "Fem", "Rio de Janeiro", 299, "345.678.789-76");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Nico", 23, "Masc", "Nova Iguaçu", 350, "213.534.445-98");
        
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Apolo", 25, "Masc", "Pelotas", 677, "312.435.768-90");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Nina", 55, "Fem", "Caxias", 769, "564.968.097-09");

        System.out.println("Pessoa física:");
        System.out.println("------------------------");
        pessoaFisica1.Visualizar();
        System.out.println("------------------------");
        pessoaFisica2.Visualizar();
        System.out.println("------------------------");

        System.out.println("\n Pessoa júridica:");
        System.out.println("------------------------");
        pessoaJuridica1.Visualizar();
        System.out.println("------------------------");
        pessoaJuridica2.Visualizar();
        
        ler.close();
    }
}
