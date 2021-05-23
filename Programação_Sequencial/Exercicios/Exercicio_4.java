package br.com.sequencial;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		

		Scanner ler = new Scanner(System.in);
		
		int horas, minutos, segundos, totalHoras, totalMinutos, restoSegundos;
		
		System.out.println ("Digite a quantidade de tempo em segundos do evento: ");
		segundos = ler.nextInt();
		
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) % 60);
		restoSegundos = ((segundos % 3600)% 60);
		
		System.out.println ("O evento durou " + horas + " horas " + minutos + " minutos e " + restoSegundos +
				" segundos" );

	}

}
