package com.loiane.cursojava.expoo;

public class Ex1 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "F50";
		lampada.tensao = "Bivolt";
		lampada.garantiaMes = 12;
		lampada.potencia = 12;
		
		lampada.tipos = new String[5]; //preciso declarar o array
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lape�o";
		
		System.out.print("A Tens�o da Lampada que vou comprar �: " + lampada.tensao);
	}
}
