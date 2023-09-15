package poo;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class TestaCurso {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Curso curso1 = new Curso(null, null, null, null, 0);
        Curso curso2 = new Curso(null, null, null, null, 0);

        Optional <Curso> checaNulo = Optional.ofNullable(curso1);
        Optional <Curso> checaNulo2 = Optional.ofNullable(curso2);
        
        try {
        
        //curso 1
        System.out.println("Digite o seu curso: ");
        curso1.setCurso(ler.nextLine());

        System.out.println("Digite sua escola ou faculdade: ");
        curso1.setEscola(ler.nextLine());

        System.out.println("Digite o método de ensino: ");
        curso1.setMetodo(ler.nextLine());

        System.out.println("Digite o período do seu curso: ");
        curso1.setPeriodo(ler.nextLine());

        System.out.println("Digite a quantidade de semestres: ");
        curso1.setSemestres(ler.nextInt());

        //curso 2
        System.out.println("Digite o seu curso: ");
        curso2.setCurso(ler.nextLine());

        System.out.println("Digite sua escola ou faculdade: ");
        curso2.setEscola(ler.nextLine());

        System.out.println("Digite o método de ensino: ");
        curso2.setMetodo(ler.nextLine());

        System.out.println("Digite o período do seu curso: ");
        curso2.setPeriodo(ler.nextLine());

        System.out.println("Digite a quantidade de semestres: ");
        curso2.setSemestres(ler.nextInt());

        curso1.Visualizar();
        System.out.println("-----------------");
        curso2.Visualizar();

        if(checaNulo.isPresent()){
			System.out.println("Dado válido.");
			
		}else{
			System.out.println("\nDado nulo. Entre com um dado válido.");
			System.out.println(curso1);
		}

        if(checaNulo2.isPresent()){
			System.out.println("Dado válido.");
			
		}else{
			System.out.println("\nDado nulo. Entre com um dado válido.");
			System.out.println(checaNulo2);
		}
        
        } catch (InputMismatchException e) {
            System.err.println("Excecao: " + e);
            ler.nextLine();
            System.out.println("\nDigite um dado válido!");
        }
        ler.close();
    }

    
    }

