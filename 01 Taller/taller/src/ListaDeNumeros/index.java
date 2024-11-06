package ListaDeNumeros;
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    // declaro los colores para la terminal
    String ANSI_AZUL = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_RESET = "\u001B[0m";
    String messageRange = ANSI_AZUL + "1 " + ANSI_RESET + "al " + ANSI_AZUL + "1000" + ANSI_RESET;
    
    System.out.println("Este programa si le ingresan un numero de "+ messageRange +"\nle va entregar un listado con todos los numeros que\ncontenga el numero ingresado y multiplos del mismo");
    System.out.print("Ingresa el un numero del " + messageRange + ": " + ANSI_AZUL);
    
    //pido el dato de entrada
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    input.close();
    
    //convierto la entrada de en un String y miro cuantos carecteres tiene
    int lenght = String.valueOf(num).length();
    
    //inicializo contadores
    int i = 1;
    int counterContain = 0;
    int counterMultiple = 0;
    int counterContainAndMultiple = 0;
    int counterDigitLine = 0;
    int divisor = 0;

    if (lenght == 1) {
      divisor = 10;
    } else if (lenght == 2) {
      divisor = 100;
    } else if (lenght == 3) {
      divisor = 1000;
    }

    //verifica la entrada
    if (num != 0 && num < 1000) { 
      // Este bucle genera un contador del 1 al 1000
      while (i <= 1000) {

        if (i % num == 0) {
          if (i % divisor == num) {
            System.out.print(" " + ANSI_AZUL + i);
            counterContainAndMultiple++;
            counterContain++;
            counterMultiple++;
            counterDigitLine++;
          } else {
            System.out.print(" " + ANSI_PURPLE + i);
            counterMultiple++;
            counterDigitLine++;
          }
        } else if (i % divisor == num) {
          System.out.print(" " + ANSI_GREEN + i);
          counterContain++;
          counterDigitLine++;
        }
        if (counterDigitLine == 20) {
          System.out.println();
          counterDigitLine = 0;
        }
        i++;
      }
    } else {
      if (num > 1000) {
        System.out.println("El numero debe ser menor a " + ANSI_AZUL + "1000" + ANSI_RESET);
      } else {
        while (i <= 1000) {
          if (i % 10 == num) {
            System.out.print(" " + ANSI_GREEN + i);
            counterContain++;
          }
          i++;
        }
      }
    }
    System.out.println();
    // verifica si los contadores se modificaron e impreme un mensaje en pantalla
    if (counterContain > 0) {
      System.out.println(ANSI_GREEN + "Es verde si el numero esta contenido" + ANSI_RESET);
      System.out.println(ANSI_RESET + "Hay " + ANSI_GREEN + counterContain + ANSI_RESET + " Numeros que contiene el "
          + ANSI_GREEN + num + ANSI_RESET);
    }
    if (counterMultiple > 0) {
      System.out.println(ANSI_PURPLE + "Es morado si es multiplo" + ANSI_RESET);
      System.out.println(ANSI_RESET + "Hay " + ANSI_PURPLE + counterMultiple + ANSI_RESET + " Multiplos del "
          + ANSI_PURPLE + num + ANSI_RESET);
    }
    if (counterContainAndMultiple > 0) {
      System.out.println(ANSI_AZUL + "Es Azul si es multiplo y se contiene" + ANSI_RESET);
      System.out.println(ANSI_RESET + "Hay " + ANSI_AZUL + counterContainAndMultiple + ANSI_RESET + " Numeros que son multiplos y que contiene a "
          + ANSI_AZUL + num + ANSI_RESET);
    }
  }
}
