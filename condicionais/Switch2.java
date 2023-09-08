package condicionais;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {
        
        String nome;
        int codigo;
        float salario;
        float novoSalario;

        Scanner leia  = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();

        
        System.out.println("1 - Gerente \r\n"+ //
        "2 - Vendedor \r\n" + //
        "3 - Supervisor \r\n" + //
        "4 - Motorista \r\n" + //
        "5 - Estoquista \r\n" +//
        "6 - Tecnico de TI");


        System.out.println("\n Digite o código do seu cargo: ");
        codigo = leia.nextInt();

        System.out.println("Digite o seu salário: ");
        salario = leia.nextFloat();

        switch (codigo) {
            case 1:
                System.out.println(nome + "\n");
                System.out.println("Gerente \n");

                float reajuste1 = (salario * 100) / 10;
                novoSalario = salario + (reajuste1 * salario);
                System.out.printf("Novo salário: R$ " + "%.3f", novoSalario);
                break;

            case 2:
                System.out.println(nome + "\n");
                System.out.println("Vendedor \n");
                
                float reajuste2 = (salario * 100) / 7;
                novoSalario = salario + (reajuste2 * salario);
                System.out.printf("Novo salário: R$ " + "%.3f", novoSalario);
                break;

            case 3:
                System.out.println(nome + "\n");
                System.out.println("Supervisor \n");

                float reajuste3 = (salario * 100) / 9;
                novoSalario = salario + (reajuste3 * salario);
                System.out.printf("Novo salário: R$ " + "%.3f", novoSalario);
                break;

            case 4:
                System.out.println(nome + "\n");
                System.out.println("Motorista \n");

                float reajuste4 = (salario * 100) / 6;
                novoSalario = salario + (reajuste4 * salario);
                System.out.printf("Novo salário: R$ " + "%.3f", novoSalario);
                break;

            case 5:
                System.out.println(nome + "\n");
                System.out.println("Estoquista \n");

                float reajuste5 = (salario * 100) / 5;
                novoSalario = salario + (reajuste5 * salario);
                System.out.printf("Novo salário: R$ " + "%.3f", novoSalario);
                break;

            case 6:
                System.out.println(nome + "\n");
                System.out.println("Técnico de TI \n");
                
                float reajuste6 = (salario * 100) / 8;
                novoSalario = salario + (reajuste6 * salario);
                System.out.printf("Novo salário: R$ " + "%.3f", novoSalario);
                break;
        
            default:
                break;
        }

        leia.close();
    }
}
