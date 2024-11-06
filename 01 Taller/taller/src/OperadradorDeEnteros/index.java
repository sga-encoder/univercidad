package OperadradorDeEnteros;

import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, aux;
		String ANSI_AZUL = "\u001B[34m";
		String ANSI_GREEN = "\u001B[32m";
		String ANSI_RESET = "\u001B[0m";
		System.out.println("Operadore De enteros");
		System.out.print(ANSI_AZUL + " a " + ANSI_RESET + "?: " + ANSI_GREEN);
		a = input.nextInt();
		System.out.print(ANSI_AZUL + " b " + ANSI_RESET + "?: " + ANSI_GREEN);
		b = input.nextInt();
		aux = a / b;
		
		System.out.println(
				ANSI_AZUL + " a " + ANSI_RESET + "+" + ANSI_AZUL + " b " + ANSI_RESET + "= "+ ANSI_GREEN + (a + b)
				+ "\n" + ANSI_AZUL + " a " + ANSI_RESET + "x" + ANSI_AZUL + " b " + ANSI_RESET + "= "+ ANSI_GREEN + (a * b)
				+ "\n" + ANSI_AZUL + " a " + ANSI_RESET + "/" + ANSI_AZUL + " b " + ANSI_RESET + "= "+ ANSI_GREEN + (a / b)
				+ "\n" + ANSI_AZUL + " a " + ANSI_RESET + "%" + ANSI_AZUL + " b " + ANSI_RESET + "= "+ ANSI_GREEN + (a % b)
				+ "\n" + ANSI_AZUL + " " + aux + ANSI_RESET + " X " + ANSI_AZUL +  b  + ANSI_RESET + " + " + ANSI_AZUL + a%b + ANSI_RESET + " = " + ANSI_GREEN + ((aux*b)+a%b) + ANSI_RESET
        );


		input.close();
	}
}
