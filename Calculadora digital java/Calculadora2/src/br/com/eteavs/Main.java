package br.com.eteavs;

import java.util.Scanner;

import br.com.eteavs.domain.Contas;

public class Main {

	public static void main(String[] args) {
		Contas pf = new Contas();
		Contas pj = new Contas();
		Scanner sc = new Scanner(System.in);
		
		
		int opc;
		
		do {
			System.out.println("\n[1] - Pessoa Fisica");
			System.out.println("[2] - Pessoa Juridica");
			System.out.println("[3] - Sair\n");
			
			System.out.print("Escolha uma opcão: ");
			opc = sc.nextInt();
			System.out.print("\n");
			
			if(opc == 1) {
				pf.PessoaFisica();
			}
			
		}while(opc != 3);

		
		
	}

}
