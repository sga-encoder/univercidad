package Varios.ContadorDeLetras;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ingresar una frase: ");
    String frase = input.nextLine();
    input.close();
    int contadorDeF = 0;
    for (int i = 0; i < frase.length(); i++) {
      if (frase.charAt(i) == 'f') {
        contadorDeF++;
      }
    }
    System.out.println("La cantidad de veces que aparece la letra F es: " + contadorDeF);
  }

}