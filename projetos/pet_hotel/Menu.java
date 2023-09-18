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
        Hospedagem hospede = new Hospedagem(null, 0, null, null, null, false, false, null, 0) {
        };

        int opcao, numero;
        //int numero;

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("\nPet Hotel");
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
                    hospede.setNome(ler.nextLine());

                    System.out.println("Digite a idade do pet:");
                    hospede.setIdade(ler.nextInt());
                    ler.skip("\\R");

                    System.out.println("Digite a espécie: ");
                    hospede.setEspecie(ler.nextLine());

                    System.out.println("Digite a raça: ");
                    hospede.setRaca(ler.nextLine());

                    System.out.println("Digite o peso do animal: ");
                    hospede.setPeso(ler.nextFloat());
                    ler.skip("\\R");

                    System.out.println("Seu pet é vacinado? (true/false)");
                    hospede.setVacina(ler.nextBoolean());
                    ler.skip("\\R");

                    System.out.println("Seu pet é castrado? (true/false)");
                    hospede.setCastracao(ler.nextBoolean());
                    ler.skip("\\R");

                    System.out.println("Digite o seu nome: ");
                    hospede.setTutor(ler.nextLine());

                    System.out.println("\nVerifique os dados inseridos:");
                    hospede.visualizar();
                    //h.cadastrar(hospede);
                    h.cadastrar(new CheckIn(null,h.gerarNumero(),  null, null, null, false, false, null, null));
                    
                    keyPress();
                    break;
                case 2:
                    System.out.println("Listar todos os hospedes.");
                    h.listar();
                    keyPress();
                    break;
                case 3:
                     System.out.println("Buscar hospede por número do quarto.");
                     System.out.println("Digite o número: ");
                     numero = ler.nextInt();

                    h.buscar();
                    keyPress();
                    break;
                case 4:
                    System.out.println("Fazer check-out.");
                    CheckOut pag = new CheckOut(null, opcao, null, null, null, false, false, null, null);
                    System.out.println("Valor da hospedagem: R$100,00");
                    System.out.println("Digite o valor que deseja pagar: ");
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
