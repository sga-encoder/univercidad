package Bucles.TablasDeMultplicar;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int num = Integer.parseInt(print.template(true, 4, "De que numeros quieres conoser sus tablas:", false, ""));
    print.template("Esta es la tabla del @c4@v0", true, num);
    for (int i = 1; i <= 12; i++) {
      print.template("@c4@v0@rt x @c4@v1@rt = @c4@v2@rt", true,  num, i, num*i);
    }
  }
}
