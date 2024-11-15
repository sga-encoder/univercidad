package OperacionesConNumeros.Cuadratica;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    int a, b, c;
    double x1 = 0, x2 = 0, d;
    boolean error = false;
    String ANSI_AZUL = "\u001B[34m";
		String ANSI_GREEN = "\u001B[32m";
    String ANSI_RESET = "\u001B[0m";
    
    Scanner input = new Scanner(System.in);
    System.out.print(ANSI_AZUL + "a" + ANSI_RESET + "?:" + ANSI_GREEN);
    a = input.nextInt();
    System.out.print(ANSI_AZUL + "b" + ANSI_RESET + "?:" + ANSI_GREEN);
    b = input.nextInt();
    System.out.print(ANSI_AZUL + "c" + ANSI_RESET + "?:" + ANSI_GREEN);
    c = input.nextInt();
    input.close();

    System.out.println(ANSI_AZUL + a +"x^2" + ANSI_RESET + " + " + ANSI_AZUL + b +"x" + ANSI_RESET + " + " + ANSI_AZUL + c + ANSI_RESET );


    d = (b*b) - (4 * a * c);
    
    if (d == 0) {
      x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
      x2 = x1;
    } else if (d > 0) {
      x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
      x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
    } else {
      error = true;
    }
    if (error) {
      System.out.println("la raices no se encuentran en los reales");
    } else {
      System.err.println(
        ANSI_AZUL + "x1" + ANSI_RESET + ": " + ANSI_GREEN + x1 + "\n" +
        ANSI_AZUL + "x2" + ANSI_RESET + ": " + ANSI_GREEN + x2 + ANSI_RESET);
    }
  }
}
