package Executavel;

import java.util.Scanner;

import Produto.Dados;

public class Executavel03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Salário bruto: ");
		double salario = sc.nextDouble();
		
		System.out.println("Imposto: ");
		double imposto = sc.nextDouble();
		
		Dados funcionario = new Dados(nome, salario, imposto);
		
		System.out.println(funcionario.toString());
		
		System.out.println("Percentual de aumento do salário?");
		double percentual = sc.nextDouble();
		
		funcionario.novoSalario(percentual);
		
		System.out.println(funcionario.dadosAtualizados());

	}

}
