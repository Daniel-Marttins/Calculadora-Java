package menu;

import java.util.Scanner;
import numeros.Numeros;
import tabuadas.Tabuada;

public class Menu {

	public static void main(String[] args) {
		Numeros calcular = new Numeros();
		Tabuada tabuada = new Tabuada();
		Scanner sc = new Scanner(System.in);
		
		int escolha;
		do {
			System.out.println("Calculadora Java\n");
			
			System.out.println("[1] - Números");
			System.out.println("[2] - Tabuadas");
			System.out.println("[3] - Quadrilateros");
			System.out.println("[4] - Sair\n");
			
			System.out.print("Escolha uma opção: ");
			escolha = sc.nextInt();
			System.out.println("");
			
			switch(escolha) {
			
			case 1:
				calcular.calcularNumeros(escolha, escolha);
				break;
			case 2:
				tabuada.tabuada(escolha);
				break;
			}
			
		}while(escolha != 4);
		

	}

}
