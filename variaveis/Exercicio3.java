package variaveis;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
	float salarioBruto, adicionalNoturno, horasExtras, descontos, salariaLiquido;
	
	System.out.println("Salário bruto: ");
	salarioBruto = leia.nextFloat();
	
	System.out.println("Adicional noturno: ");
	adicionalNoturno = leia.nextFloat();
	
	System.out.println("Horas extras: ");
	horasExtras = leia.nextFloat();
	
	System.out.println("descontos: ");
	descontos = leia.nextFloat();
	
	salariaLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
	System.out.println(salariaLiquido);

    leia.close();
    }
}
