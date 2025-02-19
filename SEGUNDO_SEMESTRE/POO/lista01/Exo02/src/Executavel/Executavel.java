package Executavel;

import java.util.Scanner;

import Produto.Retangulo;

public class Executavel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Largura e altura do triangulo: ");
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		
		Retangulo medidas = new Retangulo(largura, altura);
		
		System.out.println("Area = " + medidas.area() + "\nPerimetro = " + medidas.perimetro() + "\nDiagonal = " + medidas.diagonal());
		
	}

}
