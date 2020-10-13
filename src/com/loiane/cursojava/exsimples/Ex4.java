package com.loiane.cursojava.exsimples;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Primeira nota: ");
		double n1 = scan.nextDouble();
		
		System.out.print("Segunda nota: ");
		double n2 = scan.nextDouble();
		
		System.out.print("Terceira nota: ");
		double n3 = scan.nextDouble();
		
		System.out.print("Quarta nota: ");
		double n4 = scan.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		System.out.print("Sua média é: " + media);

	}

}
