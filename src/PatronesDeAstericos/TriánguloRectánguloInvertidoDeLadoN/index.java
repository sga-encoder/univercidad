package PatronesDeAstericos.TriánguloRectánguloInvertidoDeLadoN;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int n = Integer.parseInt(print.template(true, 0, "De que tamano quieres el triangulo rectangulo: ", false, ""));
    int contadorEspacios = 1;
    int contadorAstericos = n;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < contadorAstericos; j++) {
        print.template("* ", false, "");
      }
      for (int j = 0; j < contadorEspacios; j++) {
        print.template("  ", false, "");
      }
      print.template("", true, "");
      contadorAstericos--;
      contadorEspacios++;
    }
  }
}