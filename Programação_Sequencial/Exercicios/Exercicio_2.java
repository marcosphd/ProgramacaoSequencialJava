package br.com.sequencial;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int dia, mes, ano;
		
		System.out.println("Digite sua idade em dias: ");
		dia = ler.nextInt();
		
		ano = dia / 365;
		mes = (dia % 365) % 30;
		dia = (dia % 365) % 30;
		
		System.out.println("Você tem " + ano + " anos e " + mes + " meses e " + dia + " dias");
		
		
	}

}
