package PatronesDeAstericos.RectánguloDeLadoNxM;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int n = Integer.parseInt(print.template(true, 0, "De que tamano quieres el ancho del rectangulo: ", false, ""));
    int m = Integer.parseInt(print.template(true, 0, "De que tamano quieres el alto del rectangulo: ", false, ""));

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        print.template("* ", false, "");
      }
      print.template("", true, "");

    }
  }
}
