package br.com.poo.pratica2;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o valor inicial: ");
		double vrInicial = ler.nextDouble();
		
		System.out.println("Digite a taxa de juros: ");
		double txJuros = ler.nextDouble();
		
		System.out.println("Digite o numero de meses para o Rendimento: ");
		int numMeses = ler.nextInt();
		
		rendimento r1 = new rendimento (vrInicial,txJuros,numMeses); // cria o objeto r1 com os paramentros  no contrutor
		r1.calculaRendimento();
	}

}
