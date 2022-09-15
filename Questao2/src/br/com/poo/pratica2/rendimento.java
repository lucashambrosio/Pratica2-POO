package br.com.poo.pratica2;

public class rendimento {
	private double investInicial;
	private double taxaRendimento;
	private int numMeses;
	
	public rendimento(double investInicial, double taxaRendimento, int numMeses) {
		super();
		this.investInicial = investInicial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;
	}

	public double getInvestInicial() {
		return investInicial;
	}

	public void setInvestInicial(double investInicial) {
		this.investInicial = investInicial;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public int getNumMeses() {
		return numMeses;
	}

	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	
	public void calculaRendimento() {
		
		double rendimentoMes;
		
		rendimentoMes= getInvestInicial(); //Rendimento mes começa com o valor inicial
		
		for (int i = 0 ; i <getNumMeses();i++) {
			
			rendimentoMes = rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
			System.out.printf("Mês %d: %.2f\n ", (i+1), rendimentoMes);
		}
		
		
	}
	
	

}
