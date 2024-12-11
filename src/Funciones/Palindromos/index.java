package Funciones.Palindromos;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese un la palabra que quiere saber i es un palindromo: ");
    String palabra = input.nextLine();
    System.out.println("¿Es un palíndromo la palabra " + palabra + "? " + esPalindromo(palabra));
    input.close();
  }

  public static boolean esPalindromo(String palabra) {
    String palabraInvertida = "";
    for (int i = 0; i < palabra.length(); i++) {
      palabraInvertida = palabra.charAt(i) + palabraInvertida;
    }
    return palabra.equals(palabraInvertida);
  }
}
