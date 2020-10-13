package com.loiane.cursojava.expoo;

public class ex2 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "1234";
		conta.agencia = "5678";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.print("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		if (saqueEfetuado) {
			System.out.print("\nSaque efetuado com sucesso");
			conta.consultar();
		} else {
			System.out.print("\nSaldo insuficiente");
		}
		
		
		System.out.print("\nDepósito de 500 reais");
		conta.depositar(500);
		conta.consultar();
		
		if (conta.usaChequeEspecial()) {
			System.out.print("\nUsa cheque especial");
		} else {
			System.out.print("\nNão usa cheque especial");
		}


	}

}
