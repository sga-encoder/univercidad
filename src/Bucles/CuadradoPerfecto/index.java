package Bucles.CuadradoPerfecto;
import java.util.Scanner;
public class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ingresa el un numero que quiera saber si es un cuadrado perfecto");
    int num = input.nextInt();
    input.close();
    int resultado = 1;
    int contador = 0;
    do{
      resultado = contador * contador * contador;
      contador++;
    }
    while (num > resultado);
    if (num == resultado) {
      System.out.println("es un cuadrado perfecto de: " + (contador - 1));
    } else {
      System.out.println("no es un es un cadrado perfecto");
    }
    System.out.println(resultado + " " + contador);

  }
}
