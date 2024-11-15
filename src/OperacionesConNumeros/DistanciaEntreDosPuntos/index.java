package OperacionesConNumeros.DistanciaEntreDosPuntos;
import java.util.Scanner;
public class index {
  public static void main(String[] args) {
    String ANSI_AZUL = "\u001B[34m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_RESET = "\u001B[0m";

    Scanner input = new Scanner(System.in);
    System.out.println(ANSI_RESET + "Vamos hallar la distancia entre dos puntos");
    System.out.print(ANSI_AZUL + "X1" + ANSI_RESET + "?:" + ANSI_GREEN);
    int x1 = input.nextInt();
    System.out.print(ANSI_AZUL + "Y1" + ANSI_RESET + "?:" + ANSI_GREEN);
    int y1 = input.nextInt();
    System.out.print(ANSI_AZUL + "X2" + ANSI_RESET + "?:" + ANSI_GREEN);
    int x2 = input.nextInt();
    System.out.print(ANSI_AZUL + "Y2" + ANSI_RESET + "?:" + ANSI_GREEN);
    int y2 = input.nextInt();    
    input.close();

    double x = x2 - x1;
    double y = y2 - y1;
    
    x = Math.pow(x, 2);
    y = Math.pow(y, 2);

    double resultado = Math.sqrt(x + y);

    System.out.println(ANSI_RESET + "La distancia es de:" + ANSI_AZUL + resultado + ANSI_RESET);

  }
}
