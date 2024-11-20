package PatronesDeAstericos.PirámideInvertidaDeBaseN;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int n = Integer.parseInt(print.template(true, 0, "De que tamano quieres el triangulo rectangulo: ", false, ""));
    int contadorEspacios = 1;
    int contadorAstericos = n;

    for (int i = 0; i < n; i++) {
      for (int j = contadorEspacios; j > 0; j--) {
        print.template(" ", false, "");
      }
      for (int j = contadorAstericos; j > 0; j--) {
        print.template("* ", false, "");
      }
      print.template("", true, "");
      contadorAstericos--;
      contadorEspacios++;
    }
  }
}