package poo;

public class Funcionario {
    public static void main(String[] args) {
        
        
    }
    String nome, cargo, genero;
    int idade;
    int salario;

    public Funcionario(String nome, String cargo, String genero, int salario, int idade) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.genero = genero;
		this.salario = salario;
		this.idade = idade;
	}
	
	public void Visualizar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("\n Idade: " + this.idade);
        System.out.println("\n Gênero: " + this.genero);
        System.out.println("\n Cargo: " + this.cargo);
        System.out.println("\n Salario: " + this.salario);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
