package Varios.AdivinaAdivinador;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    int num = 50, adivine = 0, isElder = 0, aux = 50;
    
    String ANSI_AZUL = "\u001B[34m", ANSI_GREEN = "\u001B[32m", ANSI_RESET = "\u001B[0m";
    String question = "? ¿Es verdad escribir (" + ANSI_GREEN + "1" + ANSI_RESET + ") sino (" + ANSI_GREEN + "0"
        + ANSI_RESET + ")?: ";
    Scanner input = new Scanner(System.in);
    System.out.print("Cual es tu Nombre: ");
    String name = input.nextLine();
    String messageName = "!" + ANSI_AZUL + name + ANSI_RESET + "¡";
    System.out.println("El dia de hoy voy a divinarte un numero del 1 al 100 " + messageName);

    while (adivine == 0) {
      System.out.print( messageName + " Tu numero es " + ANSI_GREEN + num + ANSI_RESET + question);
      adivine = input.nextInt();
      if (adivine == 0) {
        System.out.print(messageName + " Tu numero es mayor a " + ANSI_GREEN + num + ANSI_RESET + question);
        isElder = input.nextInt(); 
        aux = aux / 2;       
        
        if (isElder == 1) {
          num += aux;
        } else {
          num -= aux;
        }

      }
    }
    input.close();
  }
}
