package Executavel;

import java.util.Scanner;
import Produto.Produto;

public class Executavel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados:");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Preço: ");
		double valor = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produtos = new Produto(nome, valor, quantidade);
		
		System.out.println(produtos.toString() + "Total R$" + produtos.valorF());
		
		System.out.println("Número de produtos a serem adicionados: ");
		int quantidadeN = sc.nextInt();
		
		produtos.adiciona(quantidadeN);
		
		System.out.println("Atualizados: " + produtos.getNome() + ", " + " R$" + produtos.getValor() + ", "+ produtos.getQuantidade() + " unidades, " + "Total R$" + produtos.valorF());
		
		System.out.println("Número de produtos a serem removidos: ");
		int quantidadeR = sc.nextInt();
		
		produtos.retira(quantidadeR);
		
		System.out.println("Atualizados: " + produtos.getNome() + ", " + " R$" + produtos.getValor() + ", "+ produtos.getQuantidade() + " unidades, " + "Total R$" + produtos.valorF());

	}

}
