package com.loiane.cursojava.expoo;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	//m�todo que realiza saque
	boolean realizarSaque(double quantiaASacar) {
		if (saldo >= quantiaASacar) { //se tem saldo na conta
			saldo -= quantiaASacar;
			return true;
		} else {
			if (especial) { //ver se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; //nao � especial e nao tem saldo
			}
		}
	}
	
	//m�todo que deposita
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	//m�todo que consulta saldo
	void consultar() {
		System.out.print("\nSaldo atual: " + saldo);
	}
	
	//m�todo que verifica se cliente usa cheque especial
	boolean usaChequeEspecial() {
		return saldo < 0; 
	}
	
}
