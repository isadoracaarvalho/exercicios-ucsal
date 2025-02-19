package Executavel;

import java.util.Scanner;

import Produto.Aluno;

public class Executavel04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Nota 1: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Nota 2: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Nota 3: ");
		double n3 = sc.nextDouble();
		
		Aluno notas = new Aluno(nome, n1, n2, n3);
		
		System.out.println(notas.toString() + notas.situacao());
		
	}

}
