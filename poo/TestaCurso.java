package poo;

public class TestaCurso {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Letras", "Estacio", "EAD", "Integral", 6);
        Curso curso2 = new Curso("Biologia", "UERJ", "Presencial", "Manhã", 8);

        curso1.Visualizar();
        System.out.println("-----------------");
        curso2.Visualizar();
    }
}
