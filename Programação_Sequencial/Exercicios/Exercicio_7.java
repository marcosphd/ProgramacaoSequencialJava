package br.com.sequencial;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o vaor de a: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o vaor de b: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o vaor de c: ");
		c = ler.nextDouble();
		
		System.out.println("Digite o vaor de d: ");
		d = ler.nextDouble();
		
		System.out.println("Digite o vaor de e: ");
		e = ler.nextDouble();
		
		System.out.println("Digite o vaor de f: ");
		f = ler.nextDouble();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("O valor de x � " + x + " e y � " + y);

	}

}
