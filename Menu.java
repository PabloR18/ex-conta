package util;

import java.util.Scanner;

public class Menu {
	
	public void menu(Scanner entrada) {
		System.out.print("1 - Cadastrar Conta\n2 - Excluir Conta\n3 - Sacar\n4 - Depositar\n5 - Solicitar Emprestimo\nR> ");
		int escolha = entrada.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println();
			System.out.print("Informe o Tipo da conta:\n1 - Pessoa Fisica\n2 - Pessoa Juridica\n3 - Conta Poupança\nR> ");
			int escolhaConta = entrada.nextInt();
			
			if(escolhaConta == 1) {
				ContaPF conta1 = new ContaPF();
				System.out.println("----- CONTA PF -----");
				System.out.print("Informe o Nome do tituar: ");
				String nomeTitular = entrada.next();
				conta1.setTitular(nomeTitular);
				
				System.out.print("Deseja efetuar um Deposito Inicial ? (S/N)");
				String depositoInicial = entrada.next();
				
			}
			break;

		default:
			break;
		}
	}
}
