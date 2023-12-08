package util;

public class ContaPJ extends Conta{
	private final double limiteEmprestimo = 2500.00;
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if(valor > getLimiteEmprestimo()) {
			System.out.println("Seu limite de Emprestimo é de R$" + getLimiteEmprestimo());
		}else {
			double saldo = getSaldo() + valor;
			setSaldo(saldo);
		}
	}
}
