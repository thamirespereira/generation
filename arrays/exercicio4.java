package arrays;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        
        final int totalAlunos = 10;
        final int totalBimestre = 4;
    
        Scanner leia = new Scanner(System.in);
        String[] nomeAlunos = new String[totalAlunos];
        double[][] notaAlunos = new double[totalAlunos][totalBimestre];
        double[] mediaAlunos = new double[totalAlunos];
    
        for (int i = 0; i < totalAlunos; ++i) {
            System.out.println("Informe o nome do " + (i + 1) + "° aluno:");
            nomeAlunos[i] = leia.nextLine();
    
            System.out.println("");
    
        }
        for (int i = 0; i < totalAlunos; ++i) {
                for (int j = 0; j < totalBimestre; ++j) {
                    System.out.println("Informe a nota do aluno " + nomeAlunos[i]
                            + " para o " + (j + 1) + "° bimestre");
                    notaAlunos[i][j] = leia.nextDouble();
                }
            }
    
        for (int i = 0; i < totalAlunos; ++i) {
            for (int j = 0; j < totalBimestre; ++j) {
                mediaAlunos[i] += notaAlunos[i][j];
            }
            mediaAlunos[i] /= totalBimestre;
            System.out.println("Media dos alunos: " + mediaAlunos[i]);
        }
        leia.close();
    }
}