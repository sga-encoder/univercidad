package EstructurasDeControl.BucleConCentinela;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    //inicializamos variables
    int sum = 0, valor;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese un valor entero(0 para terminar): ");
    valor = input.nextInt();

    // la variable valor la vamos a utilizar como centinela
    while (valor != 0) {
      sum += valor;
      System.out.print("Ingrese el siguiente valor(0 para terminar): ");
      valor = input.nextInt();
    }
    System.out.println("La suma de los valores ingresados es " + sum);
    input.close();
  }
}
