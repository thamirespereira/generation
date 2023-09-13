package poo.funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario("Maria", 20);

        func1.coordenar();
        func1.gerenciar();
        func1.vender();
    }
}
