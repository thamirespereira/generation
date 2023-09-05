package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de 
chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..
 */
public class exercicioFila {
    public static void main(String[] args) {
        
        String opcao;
        String cliente;
        Scanner ler = new Scanner(System.in);

        Queue <String> filaClientes = new LinkedList<String>();

        System.out.println("1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.\r\n" + //
                "2: Listar todos os Clientes na fila\r\n" + //
                "3: Chamar (retirar) uma pessoa da fila \r\n" + //
                "0: O programa deve ser finalizado. ");
        System.out.println("Digite uma opção: ");
        opcao = ler.nextLine();

        switch (opcao) {
            case "1":
                System.out.println("Digite um nome: ");
                cliente = ler.nextLine();
                filaClientes.add(cliente);
                break;
            
            case "2":
                System.out.println(filaClientes);
                break;
            case "3":
                if(!filaClientes.isEmpty()){
                    filaClientes.poll();
                    System.out.println("Chamou um cliente.\n");
                    System.out.println(filaClientes);
                }
                break;
        
            case "0":
                filaClientes.clear();
            break;
            default:
                System.out.println("Número inválido");
                break;

        }
        ler.close();
    }
}
