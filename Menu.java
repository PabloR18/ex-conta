package util;

import java.util.Scanner;

public class Menu extends Conta {

	public void menu(Scanner entrada) {
		System.out.print(
				"--------------------------\n1 - Cadastrar Conta\n2 - Excluir Conta\n3 - Sacar\n4 - Depositar\n5 - Solicitar Emprestimo\n6 - Sair\nR> ");
		int escolha = entrada.nextInt();

		switch (escolha) {
		case 1:
			System.out.println();
			System.out
					.print("--------------------------\nInforme o Tipo da conta:\n1 - Pessoa Fisica\n2 - Pessoa Juridica\n3 - Conta Poupança\nR> ");
			int escolhaConta = entrada.nextInt();

			if (escolhaConta == 1) {
				ContaPF conta1 = new ContaPF();
				setTipoDaConta("PF");
				
				System.out.println();
				System.out.println("----- CONTA PF -----");
				System.out.print("Informe o Nome do titular: ");
				String nomeTitular = entrada.next();
				conta1.setTitular(nomeTitular);
				
				System.out.print("Informe o número da Conta: ");
				int numeroDaConta = entrada.nextInt();
				setNumeroConta(numeroDaConta);

				System.out.print("Deseja efetuar um Deposito Inicial ?\n1 - Sim\n2 - Não\nR> ");
				int depositoInicial = entrada.nextInt();

				if (depositoInicial == 1) {
					System.out.println();
					System.out.print("Informe o valor para deposito: ");
					double valorDeposito = entrada.nextDouble();
					setSaldo(valorDeposito);
					System.out.println("Deposito realizado com sucesso!!\n");
					menu(entrada);
				} else {
					System.out.println();
					menu(entrada);
				}
			} else if (escolhaConta == 2) {
				ContaPJ conta1 = new ContaPJ();
				setTipoDaConta("PJ");

				System.out.println();
				System.out.println("----- CONTA PJ -----");
				System.out.print("Informe o Nome do titular: ");
				String nomeTitular = entrada.next();
				conta1.setTitular(nomeTitular);
				
				System.out.print("Informe o número da Conta: ");
				int numeroDaConta = entrada.nextInt();
				setNumeroConta(numeroDaConta);

				System.out.print("Deseja efetuar um Deposito Inicial ?\n1 - Sim\n2 - Não\nR> ");
				int depositoInicial = entrada.nextInt();

				if (depositoInicial == 1) {
					System.out.println();
					System.out.print("Informe o valor para deposito: ");
					double valorDeposito = entrada.nextDouble();
					setSaldo(valorDeposito);
					System.out.println("Deposito realizado com sucesso!!\n");
					menu(entrada);
				} else {
					System.out.println();
					menu(entrada);
				}
			} else if (escolhaConta == 3) {
				ContaPoupanca conta1 = new ContaPoupanca();
				setTipoDaConta("POUPANÇA");

				System.out.println();
				System.out.println("----- CONTA POUPANÇA -----");
				System.out.print("Informe o Nome do titular: ");
				String nomeTitular = entrada.next();
				conta1.setTitular(nomeTitular);
				
				System.out.print("Informe o número da Conta: ");
				int numeroDaConta = entrada.nextInt();
				setNumeroConta(numeroDaConta);

				System.out.print("Deseja efetuar um Deposito Inicial ?\n1 - Sim\n2 - Não\nR> ");
				int depositoInicial = entrada.nextInt();

				if (depositoInicial == 1) {
					System.out.println();
					System.out.print("Informe o valor para deposito: ");
					double valorDeposito = entrada.nextDouble();
					setSaldo(valorDeposito);
					System.out.println("Deposito realizado com sucesso!!\n");
					menu(entrada);
				} else {
					System.out.println();
					menu(entrada);
				}
			} else {
				System.out.println("Informe uma Opção valida!!");
				System.out.println();
				menu(entrada);
			}
			break;

		case 2:
			System.out.println();
			System.out.print("Informe o numero da conta que deseja Excluir: ");
			int contaExcluir = entrada.nextInt();
			
			if(contaExcluir == getNumeroConta()) {
				if(getSaldo() > 0) {
					System.out.println("Retire todo seu dinheiro antes de excluir a conta.");
					System.out.println();
					menu(entrada);
				}else {
					setNumeroConta(0);
					System.out.println("Conta excluida com sucesso!!");
					System.out.println();
					menu(entrada);
				}
			}else {
				System.out.println("Essa conta não existe");
				System.out.println();
				menu(entrada);
			}
	
			System.out.println();
			menu(entrada);
			break;
			
		case 3:
			System.out.println();
			System.out.print("Informe o numero da conta para efetuar o saque: ");
			int contaSaque = entrada.nextInt();
			
			System.out.print("Informe o valor do saque: ");
			double valorSaque = entrada.nextDouble();
			
			if(contaSaque == getNumeroConta()) {
				if(getSaldo() >= valorSaque) {
					saque(valorSaque);
					System.out.println("Saque efetuado com sucesso!!");
					System.out.println();
					menu(entrada);
				}else {
					System.out.println("Seu Saldo é inferior ao valor do Saque!!");
					System.out.println();
					menu(entrada);
				}
			}else {
				System.out.println("Essa conta não existe");
				System.out.println();
				menu(entrada);
			}
			break;
			
		case 4:
			System.out.println();
			System.out.print("Informe o numero da conta para efetuar o deposito: ");
			int contaDeposito = entrada.nextInt();
			
			System.out.print("Informe o valor do Deposito: ");
			double valorDeposito = entrada.nextDouble();
			
			if(contaDeposito == getNumeroConta()) {
				deposito(valorDeposito);
				System.out.println("Deposito efetuado com sucesso!!");
				System.out.println();
				menu(entrada);
			}else {
				System.out.println("Essa conta não existe");
				System.out.println();
				menu(entrada);
			}
			break;
			
		case 5:
			System.out.println();
			System.out.print("Informe o numero da conta para solicitar o emprestimo: ");
			int contaEmprestimo = entrada.nextInt();
			
			if(contaEmprestimo === "PF") {
				
			}
			
			break;
		case 6:
			System.out.println();
			System.out.println("Obrigado por usar nossa Aplicação!!");
			break;
			
		default:
			System.out.println();
			System.out.println("Informe um valor valido!!");
			System.out.println();
			menu(entrada);
			break;
			
		}
	}
}
