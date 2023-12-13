package util;

public class ContaPJ extends Conta {
	private final double limiteEmprestimo = 2500.00;

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor > getLimiteEmprestimo()) {
			System.out.println("Seu limite de Emprestimo é de R$" + String.format("%.2f", getLimiteEmprestimo()));
			System.out.println();
		} else {
			double saldo = getSaldo() + valor;
			setSaldo(saldo);
			System.out.println("O valor foi adicionado a sua conta!!");
			System.out.println();
		}
	}
}