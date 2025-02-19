package Produto;

public class Dados {
	
	String nome;
	double salario, imposto;
	public Dados(String nome, double salario, double imposto) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.imposto = imposto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void novoSalario(double salario) {
		this.salario -= imposto;
		this.salario *= (1 + (salario/100));
	}
	
	@Override
	public String toString() {
		return "Empregado: \nNome: " + nome + "\nSalario Líquido: R$" + (salario - imposto) + "\nImposto: R$" + imposto + " ";
	}
	
	public String dadosAtualizados() {
		return "Dados Atualizados: \nNome: " + nome + "\nSalário com aumento: R$" + salario;
	}

}
