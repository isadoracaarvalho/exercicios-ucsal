package Produto;

public class Retangulo {
	
	double largura, altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
			}
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return altura * largura;
	}

	public double perimetro() {
		return ((altura * 2) + (largura * 2));
	}

	public double diagonal() {
		return Math.sqrt((altura * altura)+(largura * largura));
	}

}
