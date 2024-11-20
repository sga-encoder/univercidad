package PatronesDeAstericos.CuadradoDeLadoN;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int n = Integer.parseInt(print.template(true, 0, "De que tamano quieres el cuadrado: ", false, ""));

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        print.template("* ", false, "");
      }
      print.template("", true, "");

    }
  }
}
