package OperacionesConNumeros.ConversorDeRGBaCMYK;

import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String colorRGB, aux;
		double redColor = 0, greenColor = 0, blueColor = 0;
		double cyanColor, magentaColor, yellowColor, blackColor, whiteColor, aux2;
		int posicion;
		System.out.println("hola bienvenido a el conversor de color RGB a CMYK");
		System.out.print("Por favor ingrese el color RGB divididos por comas o espacios:");
		colorRGB = input.nextLine() + " ";
        input.close();
		posicion = 0;
		aux = "";

		for (int i = 0; i < colorRGB.length(); i++) {
			if (colorRGB.charAt(i) == ' ' || colorRGB.charAt(i) == ',') {
				if (posicion == 0) {
					aux2 = Integer.parseInt(aux);
					if (aux2 < 255 && aux2 >= 0) {
						redColor = (aux2 / 255);
					} else {
						System.out.println("el numero debe ser menor a 255");
					}
				}
				if (posicion == 1) {
					aux2 = Integer.parseInt(aux);
					if (aux2 < 255 && aux2 >= 0) {
						greenColor = (aux2 / 255);
					} else {
						System.out.println("el numero debe ser menor a 255");
					}
				}
				if (posicion == 2) {
					aux2 = Integer.parseInt(aux);
					if (aux2 < 255 && aux2 >= 0) {
						blueColor = (aux2 / 255);
					} else {
						System.out.println("el numero debe ser menor a 255");
					}
				}
				aux = "";
				posicion++;
			} else {
				aux += colorRGB.charAt(i);
			}
		}

		if (redColor > blueColor && redColor > greenColor) {
			whiteColor = redColor;
		} else if (greenColor > redColor && greenColor > blueColor) {
			whiteColor = greenColor;
		} else {
			whiteColor = blueColor;
		}

		cyanColor = (whiteColor - redColor) / whiteColor;
		magentaColor = (whiteColor - greenColor) / whiteColor;
		yellowColor = (whiteColor - blueColor) / whiteColor;
		blackColor = 1 - whiteColor;

		System.out.println("cyan: " + cyanColor + "\n" + "magenta: " + magentaColor + "\n" + "yellow: " + yellowColor + "\n"
				+ "black: " + blackColor);

		
	}
}
