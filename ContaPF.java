package util;

public class ContaPF extends Conta {
	private final double limiteEmprestimo = 1100.50;
	private final double taxaSaque = 1.75;

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public double getTaxaSaque() {
		return taxaSaque;
	}

	public void emprestimo(double valor) {
		if (valor > getLimiteEmprestimo()) {
			System.out.println("Seu limite de Emprestimo é de R$" + String.format("%.2f", getLimiteEmprestimo()));
			System.out.println();
		} else {
			double saldo = (getSaldo() + valor) - getTaxaSaque();
			setSaldo(saldo);
			System.out.println("O valor foi adicionado a sua conta!!");
			System.out.println();
		}
	}
}