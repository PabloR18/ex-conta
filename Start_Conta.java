package aplication;

import java.util.Scanner;

import util.Menu;

public class Start_Conta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Menu contaTeste = new Menu();
		
		contaTeste.menu(entrada);
		entrada.close();
	}

}
