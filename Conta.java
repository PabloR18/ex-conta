package util;

import java.util.Scanner;

public class Conta {
	protected int numeroConta;
	protected String titular;
	protected double saldo;

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	// ---------------------------------------------------------------------------
	
	public void saque(double valor) {
		double valorSaque = getSaldo() - valor;
		setSaldo(valorSaque);
	}
	
	public void deposito(double valor) {
		double valorDeposito = getSaldo() + valor;
		setSaldo(valorDeposito);
	}
	
}
