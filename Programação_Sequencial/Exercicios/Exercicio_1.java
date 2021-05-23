package br.com.sequencial;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int ano, mes,dia, mesDias, anoDias, idadeDias;
		
		System.out.println("Quantos anos você tem? ");
		ano = ler.nextInt();
		
		System.out.println("Quantos meses você tem? ");
		mes = ler.nextInt();
		
		System.out.println("E quantos dias? ");
		dia = ler.nextInt();
		
		mesDias = mes * 30;
		anoDias = ano * 365;
		idadeDias = (dia + mesDias + anoDias);
		
		System.out.println("Sua idade em dias é: " + idadeDias + " dias");
	}

}
