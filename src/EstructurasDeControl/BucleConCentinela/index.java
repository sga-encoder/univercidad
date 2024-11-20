package EstructurasDeControl.BucleConCentinela;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    // inicializamos variables
    int sum = 0, valor;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese un valor entero(0 para terminar): ");
    valor = input.nextInt();
    int contador = 0;
    int contadorPositivo = 0;
    int contadorNegativo = 0;
    if (valor > 0) {
      contadorPositivo++;
    } else {
      contadorNegativo++;
    }
    int mayor = valor;
    int menor = valor;

    // la variable valor la vamos a utilizar como centinela. y realisamos las sumas
    while (valor != 0) {
      sum += valor;
      System.out.print("Ingrese el siguiente valor(0 para terminar): ");
      valor = input.nextInt();
      if (valor > 0) {
        contadorPositivo++;
      } else if (valor < 0) {
        contadorNegativo++;
      }

      mayor = Math.max(mayor, valor);
      if (valor != 0) {
        menor = Math.min(menor, valor);
      }
      contador++;
    }
    System.out.println("La suma de los valores ingresados es " + sum);
    System.out.println("La cantidad de los valores ingresados es " + contador);
    System.out.println("La cantidad de los valores positivos ingresados es " + contadorPositivo);
    System.out.println("La cantidad de los valores negativos ingresados es " + contadorNegativo);
    System.out.println("El mayor numero ingresados es " + mayor);
    System.out.println("El menor numero ingresados es " + menor);
    input.close();
  }
}
