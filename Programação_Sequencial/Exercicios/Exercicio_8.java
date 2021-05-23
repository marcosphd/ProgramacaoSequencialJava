package br.com.sequencial;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		
		
		Scanner ler = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = ler.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica * 0.25);
		custoConsumidor = distribuidor + (distribuidor * 0.45);
		
		System.out.println("O custo do consumidor é de: R$ " + custoConsumidor);
		
		
	}

}
