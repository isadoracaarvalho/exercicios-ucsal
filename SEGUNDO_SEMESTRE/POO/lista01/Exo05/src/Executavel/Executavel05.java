package Executavel;

import java.util.Scanner;

import Produto.ConversorMoeda;

public class Executavel05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor do dólar?");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantidade de dolares comprados?");
		double quantidade = sc.nextDouble();
		
		ConversorMoeda converte = new ConversorMoeda(dolar, quantidade);
		
		System.out.println(converte.toString());

	}

}
