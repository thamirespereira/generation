package condicionais;

import java.util.Scanner;

public class ExercicioIf4 {
    public static void main(String[] args) {
        
        String classe;
        String familia;
        String alimentacao;

        Scanner leia = new Scanner(System.in);

        System.out.println("Vertebrado ou invertebrado? ");
        classe = leia.nextLine();

        if (classe.equalsIgnoreCase("Vertebrado")){
            System.out.println("Ave ou mamífero?");
            familia = leia.nextLine();

            if(familia.equalsIgnoreCase("mamifero")){
                System.out.println("Onívoro ou herbívoro?");
                alimentacao = leia.nextLine();

                if (alimentacao.equalsIgnoreCase("Onivoro")){
                System.out.println("Homem");
                }else{
                System.out.println("Vaca");
            }
            }else {
                System.out.println("Onívoro ou carnívoro?");
                alimentacao = leia.nextLine();

                if(alimentacao.equalsIgnoreCase("Onivoro")){
                    System.out.println("Pomba");
                }else{
                    System.out.println("Águia");
                }
            }
        }else{
            System.out.println("Inseto ou anelídeo?");
            familia = leia.nextLine();

            if (familia.equalsIgnoreCase("Inseto")){
                System.out.println("Hematófago ou herbívoro?");
                alimentacao = leia.nextLine();

                if (alimentacao.equalsIgnoreCase("Hematofago")){
                    System.out.println("Pulga");
                }else{
                    System.out.println("Lagarta");
                }
            }else{
                System.out.println("Hematófago ou onívoro?");
                alimentacao = leia.nextLine();

                if (alimentacao.equalsIgnoreCase("Hematofago")){
                    System.out.println("Sanguessuga");
                }else{
                    System.out.println("Minhoca");
                }
            }
        }
        leia.close();
    }
}
