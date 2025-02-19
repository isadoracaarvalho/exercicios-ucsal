package Produto;

public class ConversorMoeda {
	
	double dolar, quantidade;

	public ConversorMoeda(double dolar, double quantidade) {
		super();
		this.dolar = dolar;
		this.quantidade = quantidade;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double conversao() {
		return (dolar * quantidade) + ((dolar * quantidade) * 6/100);
	}

	@Override
	public String toString() {
		return "Valor a ser pago em reais: R$" + conversao();
	}

}
