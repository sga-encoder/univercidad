package Varios.ListaDeNumeros;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    // declaro los colores para la terminal
    Printer print = new Printer();
    
    print.template("Este programa si le ingresan un numero de @c41@rt al @c41000@rt \nle va entregar un listado con todos los numeros que\ncontenga el numero ingresado y multiplos del mismo", true, "");
    
    //pido el dato de entrada
    int num = Integer.parseInt(print.template(true, 4, "Ingresa el un numero del @c41@rt al @c41000@rt: ", false, ""));
    
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
            print.template(" @c4@v0", false, i);
            counterContainAndMultiple++;
            counterContain++;
            counterMultiple++;
            counterDigitLine++;
          } else {
            print.template(" @c5@v0", false, i);
            counterMultiple++;
            counterDigitLine++;
          }
        } else if (i % divisor == num) {
          print.template(" @c2@v0", false, i);
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
        print.template("El numero debe ser menor a @c41000", false, "");
      } else {
        while (i <= 1000) {
          if (i % 10 == num) {
            print.template(" @c2@v0", false, i);
            counterContain++;
          }
          i++;
        }
      }
    }
    System.out.println();
    // verifica si los contadores se modificaron e impreme un mensaje en pantalla
    if (counterContain > 0) {
      print.template("@c2Es verde si el numero esta contenido\nHay @c2@v0@rt Numeros que contiene el @c2@v1", true, counterContain, num);
    }
    if (counterMultiple > 0) {
      print.template("@c5Es morado si es multiplo\nHay @c5@v0@rt Multiplos del @c5@v1", true, counterMultiple, num);

    }
    if (counterContainAndMultiple > 0) {
      print.template("@c4Es Azul si es multiplo y se contiene\nHay @c4@v0@rt Numeros que son multiplos y que contiene a @c4@v1", true, counterContainAndMultiple, num);
    }
  }
}
