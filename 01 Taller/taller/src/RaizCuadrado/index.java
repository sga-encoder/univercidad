package RaizCuadrado;

import java.util.Scanner;
public class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("pasame un numero positivo para sacarle raiz cuadrada: ");
    double num = input.nextInt();
    // final double PRECICION = 1e-10;
    input.close();
    double r = 5;
    double d = 0;
    double aux = 0, aux2 = 0.1;


    // while ((aux - aux2) < PRECICION ) {
    while (aux != aux2) {
      r = (d+r)/2.0;
      d = num / r;
      aux2 = aux;
      aux = r;
    }
    System.out.println("el resutado" + d);
  }
}

