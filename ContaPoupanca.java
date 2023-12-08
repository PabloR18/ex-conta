package util;

public class ContaPoupanca extends Conta {
	
	private final double taxaRendimento = 1.5;
	

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void atualizarSaldo(double valor) {
		double atualizarSaldo = valor + (valor * getTaxaRendimento());
		setSaldo(atualizarSaldo);
	}
}
