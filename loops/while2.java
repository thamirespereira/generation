package loops;
import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e 
precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as seguintes 
informações de cada colaborador:
Idade (Número inteiro)
Sexo (Número Inteiro): 
1 – Masculino
2 – Feminino
3 – Outros
Categoria (Número Inteiro):
1 – Backend
2 – Frontend
3 – Mobile
4 – FullStack
Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de 
um novo colaboradore ou não (S/N). Caso seja pressionada a tecla N, mostre na tela:

O número de pessoas desenvolvedoras Backend
O número de mulheres desenvolvedoras Frontend
O número de homens desenvolvedores Mobile maiores de 40 anos
O número de mulheres desenvolvedoras FullStack menores de 30 anos
 */
public class while2 {

    public static void main(String[] args) {
        
        int idade = 0;
        int categoria, sexo;
        Scanner ler = new Scanner(System.in);

        int backend = 0;
        int homemMbMaior40 = 0;
        int mulherFront = 0;
        int mulherFullMenor30 = 0;

        String simnao;
        System.out.println("Deseja ver os dados de outros colaboradores? S/N");
        simnao = ler.nextLine();

        do {
            
            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();

            System.out.println("1 Masculino, 2 Feminino, 3 Outros");
            System.out.println("Gênero: ");
            sexo = ler.nextInt();

            while (sexo < 1 || sexo > 3) {
				System.out.println("Digite o gênero: ");
				sexo = ler.nextInt();
			}
            System.out.println("Digite a categoria:");
			System.out.println("1 Backend, 2 Frontend, 3 Mobile, 4 FullStack");
			categoria = ler.nextInt();

			while (categoria < 1 || categoria > 4) {
                System.out.println("1 Backend, 2 Frontend, 3 Mobile, 4 FullStack");
				System.out.println("Digite a categoria: ");
				categoria = ler.nextInt();
			}

        if (categoria == 1) {
        backend ++;
        }
        if (sexo == 2 && categoria == 2) {
            mulherFront++;
           
        }

        if(sexo == 1 && categoria == 3 && idade > 40){
            homemMbMaior40++;
          ;
        }
         if (sexo == 2 && categoria == 4 && idade < 30){
            mulherFullMenor30++;
            
        }

        System.out.println("Número de pessoas desenvolvedoras BackEnd: " + backend);
        System.out.println("Mulheres desenvolvedoras frontend: " + (mulherFront));
        System.out.println("Homens desenvolvedores Mobile maior que 40 anos: " + (homemMbMaior40));
        System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + (mulherFullMenor30));

        }while (simnao.equalsIgnoreCase("s"));

        ler.close();
        }
    }


