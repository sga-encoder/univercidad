package PatronesDeAstericos.TriánguloIsócelesDeAlturaN;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int n = Integer.parseInt(print.template(true, 0, "De que tamano quieres el triangulo isoceles: ", false, ""));
    int contadorEspacios = 1;
    int contadorAstericos1 = 1;
    int contadorAstericos2 = n;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < contadorAstericos1; j++) {
        print.template("* ", false, "");
      }
      print.template("", true, "");
      contadorAstericos1++;

    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < contadorAstericos2; j++) {
        print.template("* ", false, "");
      }
      for (int j = 0; j < contadorEspacios; j++) {
        print.template(" ", false, "");
      }
      print.template("", true, "");
      contadorAstericos2--;
      contadorEspacios++;
    }
  }
}