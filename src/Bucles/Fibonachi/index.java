package Bucles.Fibonachi;
import java.util.Scanner;

public class index{
  public static void main(String[] args) {
    int aux1 = 1, aux2 = 1, aux3 = 0;
    System.out.print("increse el numero que desea saber si pertenese a la secuencia de fibonachi: ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    input.close();
    System.out.print("1 1"); 
    boolean ya = false;
    while (!ya) {
      aux3 = aux1 + aux2;
      aux1 = aux2;
      aux2 = aux3;
      if (aux3 > num) {
        ya = true;
        if (aux3 == num) {
          System.out.println("si esta");
        } else {
          System.out.println(" no esta");
        }
      } else {
        System.out.print(aux3 + " ");
      }
    }
  }
}