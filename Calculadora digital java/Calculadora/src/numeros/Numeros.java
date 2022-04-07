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
			System.out.println("[2] - Subtra��o");
			System.out.println("[3] - Multiplica��o");
			System.out.println("[4] - Divis�o");
			System.out.println("[5] - Potencia��o");
			System.out.println("[6] - Sair\n");
			
			System.out.print("Escolha uma op��o acima: \n");
			opc = sc.nextInt();
			
			switch(opc) {
			
			case 1:
				System.out.print("Informe um n�mero: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro n�mero: ");
				num2 = sc.nextInt();
				System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.println("\n");
			case 2:
				System.out.print("Informe um n�mero: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro n�mero: ");
				num2 = sc.nextInt();
				System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
			case 3:
				System.out.print("Informe um n�mero: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro n�mero: ");
				num2 = sc.nextInt();
				System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
				System.out.println("\n");
			case 4:
				System.out.print("Informe um n�mero: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro n�mero: ");
				num2 = sc.nextInt();
				if(num1 < num2) {
					System.out.println("N�o � possivel realizar a opera��o!");
				}
				System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
				System.out.println("\n");
			case 5:
				System.out.print("Informe um n�mero: ");
				num1 = sc.nextInt();
				System.out.print("Informe outro n�mero: ");
				num2 = sc.nextInt();
				double elev = Math.pow(num1, num2);
				System.out.print(num1 + " ^ " + num2 + " = " + elev);
				System.out.println("\n");
			}
			
		}while(opc != 6);
	}
}
