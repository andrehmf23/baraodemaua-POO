package Funcionario;

public class Funcionario {
	String nome;
	float salario;
	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void AumentarSalario(int porcent) {
		salario += (salario*porcent)/100;
	}

	static public void main(String[] args) {
		Funcionario f1 = new Funcionario("Harry", 25000);
		System.out.println("Nome: " + f1.getNome() + " Salario: " + f1.getSalario());
		f1.AumentarSalario(10);
		System.out.println("Nome: " + f1.getNome() + " Salario: " + f1.getSalario());
	}
}
