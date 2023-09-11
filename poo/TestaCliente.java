package poo;

import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        System.out.println("Nome: ");
        cliente1.setNome(ler.nextLine());
        
        System.out.println("Cidade: ");
        cliente1.setCidade(ler.nextLine());

        System.out.println("Genero: ");
        cliente1.setGenero(ler.nextLine()); 
        
        System.out.println("Total em compras: ");
        cliente1.setTotalCompras(ler.nextFloat());
        
        System.out.println("Idade: ");
        cliente1.setIdade(ler.nextInt());
        
        //cliente 2
        
        System.out.println("Nome: ");
        cliente2.setNome(ler.nextLine());
        
        System.out.println("Cidade: ");
        cliente2.setCidade(ler.nextLine());

        System.out.println("Genero: ");
        cliente2.setGenero(ler.nextLine()); 
        
        System.out.println("Total em compras: ");
        cliente2.setTotalCompras(ler.nextFloat());
        
        System.out.println("Idade: ");
        cliente2.setIdade(ler.nextInt());
        
        cliente1.Visualizar();
        System.out.println("------------------------");
        cliente2.Visualizar();
        
        ler.close();
    }
}
