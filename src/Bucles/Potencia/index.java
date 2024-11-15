package Bucles.Potencia;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    System.out.println("Este programa es para realizar exponentes");
    System.out.print("damen la base: ");
    
    Scanner input = new Scanner(System.in);
    int base = input.nextInt();
    System.out.print("dame el exponente : ");
    int exponente = input.nextInt();
    input.close();

    int aux = base;
    for (int i = 1; i < exponente; i++) {
      aux = aux * base;
    }
    
    System.out.println("el resultado es: " + aux);
  }
}
