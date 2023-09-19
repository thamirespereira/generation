package projetos.pet_hotel;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import projetos.pet_hotel.Hospedagem;
import projetos.pet_hotel.CheckIn;
import projetos.pet_hotel.CheckOut;
import projetos.pet_hotel.HospController;

public class Menu {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        HospController h = new HospController();
     
        int opcao, idade, numero;
        String nome, especie, raca, tutor;
        Boolean vacina, castracao;
        Float peso;

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("\n         Pet Hotel");
            System.out.println("\n--------------------------------");
            System.out.println("\nOpção 1: Fazer check-in. ");
            System.out.println("Opção 2: Listar todos os hospedes.");
            System.out.println("Opção 3: Buscar hospede por número do quarto.");
            System.out.println("Opção 4: Fazer check-out.");
            System.out.println("Opção 5: Sair.");
            System.out.println("\n--------------------------------");
            System.out.println("\nEntre com a opção desejada: ");

            try {
                opcao = ler.nextInt();
                ler.skip("\\R");
            } catch (InputMismatchException e) {
                System.err.println("Exceção:" + e);
                System.out.println("Digite uma opção válida!");
                ler.nextInt();
                opcao = 0;
            }
            
            if (opcao == 5) {
                System.out.println("Obrigado por visitar nosso hotel!");
                ler.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Fazer check-in: ");
                    
                    System.out.println("\nDigite o nome do pet: ");
                    nome = ler.nextLine();

                    System.out.println("Digite a idade do pet:");
                    idade = ler.nextInt();
                    ler.skip("\\R");

                    System.out.println("Digite a espécie: ");
                    especie = ler.nextLine();

                    System.out.println("Digite a raça: ");
                    raca = ler.nextLine();

                    System.out.println("Digite o peso do animal: ");
                    peso = ler.nextFloat();
                    ler.skip("\\R");

                    System.out.println("Seu pet é vacinado? (true/false)");
                    vacina = ler.nextBoolean();
                    ler.skip("\\R");

                    System.out.println("Seu pet é castrado? (true/false)");
                    castracao = ler.nextBoolean();
                    ler.skip("\\R");

                    System.out.println("Digite o seu nome: ");
                    tutor = ler.nextLine();

                    h.cadastrar(new CheckIn(nome, idade, especie, raca, peso, vacina, castracao, tutor, h.gerarNumero()));
                    
                    keyPress();
                    break;
                case 2:
                    System.out.println("Listar todos os hospedes.");
                    h.listar();
        
                    keyPress();
                    break;
                case 3:
                     System.out.println("Buscar hospede por número do quarto.");
                     System.out.println("Digite o número desejado: ");
                     numero = ler.nextInt();

                    h.buscar(numero);
                    keyPress();
                    break;
                case 4:
                    System.out.println("Fazer check-out.");
                    CheckOut pag = new CheckOut(null, opcao, null, null, null, false, false, null, null);
                    System.out.println("Valor da hospedagem: R$100,00");
                    System.out.println("Digite o valor: ");
                    
                    pag.setPagamento(ler.nextFloat());

                    h.pagar();

                    keyPress();
                    break;                
            
                default:
                    System.out.println("Opção Inválida!");
                    keyPress();
                    break;
            }
        }  
    }

    public static void keyPress() {
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você apertou uma tecla diferente de enter!");
        }
    }
}
