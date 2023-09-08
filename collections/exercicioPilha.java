package collections;
/*Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada 
de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
 */
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {
    public static void main(String[] args) {
        
        String livro;
        String entrada;
        Scanner ler = new Scanner(System.in);

        Stack <String> stack = new Stack<String>();

        System.out.println("Digite um numero");
        entrada = ler.nextLine();

        switch (entrada) {
            case "1":
                System.out.println("Digite um livro: ");
                livro = ler.nextLine();
                stack.add(livro);
                break;
            
            case "2":
                System.out.println(stack);
                break;
            case "3":
                if(!stack.isEmpty()){
                    stack.pop();
                    System.out.println("Chamou um cliente.\n");
                    System.out.println(stack);
                }
                break;
        
            case "0":
                stack.clear();
            break;
            default:
                System.out.println("Número inválido");
                break;
        }
    ler.close();
}
    }
