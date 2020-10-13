package com.loiane.cursojava.exsimples;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); { //solicita entrada de dado
		
		System.out.print("Entre com o 1o número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Entre com o 2o número: ");
		int num2 = scan.nextInt();
		
		int resultado = num1 + num2;
		System.out.print("A soma dos números é: " + resultado);
		
		}
	}

}
