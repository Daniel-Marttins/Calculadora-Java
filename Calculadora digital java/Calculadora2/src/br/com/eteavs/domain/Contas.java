package br.com.eteavs.domain;

import java.util.Scanner;

public class Contas {
	
	String nome;
	double saldo = 0, deposito, saque, transferencia;
	
	public void PessoaFisica() {
		
		Scanner sc = new Scanner(System.in);
		
		int opc;
		int op;
		
		this.saldo = saldo;
		saldo = saldo;
		this.deposito = deposito;
		deposito = deposito;
		
		do {
			System.out.println("[1] - Saldo da conta");
			System.out.println("[2] - Deposito");
			System.out.println("[3] - Saque");
			System.out.println("[4] - Transferencia");
			System.out.println("[5] - Voltar\n");
			
			System.out.print("Informe a opção da sua conta: ");
			opc = sc.nextInt();
			System.out.println("");
			
			switch(opc) {
			case 1:
				System.out.println("O saldo da sua conta = " + saldo + "\n");
			case 2:
				System.out.println("Deseja realizar um deposito ? [1] - S / [2] - N");
				op = sc.nextInt();
				if(op == 1) {
					System.out.print("Digite o valor R$: ");
					double valor = sc.nextDouble();
					saldo = valor;
				}
			}
				
			
		}while(opc != 5);
		
		
		
		
	}

}
