package numeros;

import java.util.Scanner;

public class Numeros {
	
	Scanner sc = new Scanner(System.in);
	
	int num1;
	int num2;
	
	public void calcularNumeros(int num1, int num2) {
		int opc;
		
		do {
			System.out.println("Calculadora\n");
			System.out.println("[1] - Soma");
			System.out.println("[2] - Subtração");
			System.out.println("[3] - Multiplicação");
			System.out.println("[4] - Divisão");
			System.out.println("[5] - Potenciação");
			System.out.println("[6] - Sair\n");
			
			System.out.print("Escolha uma opção acima: \n");
			opc = sc.nextInt();
			
			switch(opc) {
			
			case 1:
				System.out.print("Informe um número: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro número: ");
				num2 = sc.nextInt();
				System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.println("\n");
			case 2:
				System.out.print("Informe um número: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro número: ");
				num2 = sc.nextInt();
				System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
			case 3:
				System.out.print("Informe um número: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro número: ");
				num2 = sc.nextInt();
				System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
				System.out.println("\n");
			case 4:
				System.out.print("Informe um número: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro número: ");
				num2 = sc.nextInt();
				if(num1 < num2) {
					System.out.println("Não é possivel realizar a operação!");
				}
				System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
				System.out.println("\n");
			case 5:
				System.out.print("Informe um número: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro número: ");
				num2 = sc.nextInt();
				double elev = Math.pow(num1, num2);
				System.out.print(num1 + " ^ " + num2 + " = " + elev);
				System.out.println("\n");
			}
			
		}while(opc != 6);
	}
}
