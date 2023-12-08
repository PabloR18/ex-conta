package util;

public class ContaPF extends Conta{
	private final double limiteEmprestimo = 1100.50;
	private final double taxaSaque = 1.75;
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	
	public double getTaxaSaque() {
		return taxaSaque;
	}

	public void emprestimo(double valor) {
		if(valor > getLimiteEmprestimo()) {
			System.out.println("Seu limite de Emprestimo é de R$" + getLimiteEmprestimo());
		}else {
			double saldo = (getSaldo() + valor) - getTaxaSaque();
			setSaldo(saldo);
		}
	}
}
