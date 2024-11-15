package Varios.Seno;
import java.util.Scanner;
public class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ingrese el angulo en RAD: ");
    double rad = input.nextDouble();
    input.close();
    final double PRECICION = 1e-6;
    double sen = 0;
    double potencia1 = -1;
    double divicion = 1;
    double n = 0;
    while (Math.abs(divicion)>PRECICION) {
      potencia1 *= -1;

      double num = (2 * n) + 1;
      double potencia2 = 1;

      for (double i = 0; i < num; i++) {
        potencia2 *= rad;
      }

      double factorial = 1;
      for (double i = num; i > 0; i--) {
        factorial *= i;
      }


      double numerador = potencia1 * potencia2;
      divicion = numerador / factorial;
      sen += divicion;
      n++;
      System.out.println(n);
    }
    
    System.out.println("mi resultado: " + sen);
    System.out.println("libreria:     " + Math.sin(rad));
  }
}