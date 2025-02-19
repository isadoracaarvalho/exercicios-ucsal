package Produto;

public class Produto {
	
	String nome;
	double valor;
	int quantidade;
	public Produto(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "nome: " + nome + ", valor R$" + valor + ", quantidade: " + quantidade + " ";
	}
	
	public double valorF() {
		return valor * quantidade;
	}
	public void adiciona(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void retira(int quantidade) {
		this.quantidade -= quantidade;
	}

}
