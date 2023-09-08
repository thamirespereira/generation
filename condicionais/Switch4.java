package condicionais;

import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        
        float saldo = 1000;
        float saque;
        float deposito;
        int operacao;

        Scanner leia = new Scanner(System.in);

        System.out.println("1 - saldo \r\n" +
        "2 - saque \r\n" +
        "3 - depósito");
        System.out.println("Digite uma operação: ");
        operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Saldo: " + saldo);
                break;

            case 2:
                System.out.println("Digite um valor: ");
                saque = leia.nextFloat();

                if(saque < saldo){
                    saldo -= saque;
                    System.out.println(saldo);
                }else {
                    System.out.println("Saldo insuficiente.");
                }
                break;

            case 3:
                System.out.println("Digite um valor: ");
                deposito = leia.nextFloat();
                saldo += deposito;
                System.out.println(saldo);
                break;
        
            default:
                System.out.println("Operação inválida.");
                break;
        }

        leia.close();
    }
}
