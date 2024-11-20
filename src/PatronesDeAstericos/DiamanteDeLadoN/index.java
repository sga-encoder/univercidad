package PatronesDeAstericos.DiamanteDeLadoN;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int n = Integer.parseInt(print.template(true, 0, "De que tamano quieres el triangulo rectangulo: ", false, ""));
    int contadorEspacios = n - 1;
    int contadorAstericos = 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < contadorEspacios; j++) {
        print.template(" ", false, "");
      }
      for (int j = 0; j < contadorAstericos; j++) {
        print.template("* ", false, "");
      }
      print.template("", true, "");
      contadorAstericos++;
      contadorEspacios--;
    }

    contadorEspacios = 1;
    contadorAstericos = n;

    for (int i = 0; i < n - 1; i++) {
      for (int j = contadorEspacios; j > 0; j--) {
        print.template(" ", false, "");
      }
      for (int j = contadorAstericos-1; j > 0; j--) {
        print.template("* ", false, "");
      }
      print.template("", true, "");
      contadorAstericos--;
      contadorEspacios++;
    }
  }
}
