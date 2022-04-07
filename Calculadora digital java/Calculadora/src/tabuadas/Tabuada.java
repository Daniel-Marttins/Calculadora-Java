package tabuadas;

import java.util.Scanner;

public class Tabuada {
	
	int numero;
	
	public void tabuada(int numero){
		
		Scanner sc = new Scanner(System.in);
		int sair;
		do {
			System.out.print("Informe a tabuada desejada: ");
			numero = sc.nextInt();
			System.out.println("");
			
			System.out.println("Tabuada de " + numero + "\n");
			
			for(int i = 1; i <=10; i++) {
				System.out.println(numero + " X " + i + " = " + (numero * i));
			}
			
			System.out.print("\nDeseja Sair ? [1] - S / [2] - N: \n");
			sair = sc.nextInt();
			
		}while(sair != 1);
		
	}

}
