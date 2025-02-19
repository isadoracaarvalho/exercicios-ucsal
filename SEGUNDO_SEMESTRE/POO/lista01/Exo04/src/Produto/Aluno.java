package Produto;

public class Aluno {
	
	String nome;
	double n1, n2, n3;
	public Aluno(String nome, double n1, double n2, double n3) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	public String situacao() {
		
		if ((n1 + n2 + n3) >= 60) {
			
			return "Aprovado";
			
		} else {
			
			double num = 60 - (n1 + n2 + n3);
			String num1 = String.valueOf(num);
			return "Reprovado\n Faltaram " + num1 + " pontos";
			
		}
		
	}
	@Override
	public String toString() {
		return "Nota final = " + (n1 + n2 + n3) + "\nSituação: ";
	}
	
}
