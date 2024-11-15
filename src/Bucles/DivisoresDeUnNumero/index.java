package Bucles.DivisoresDeUnNumero;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int num = Integer.parseInt(print.template(true, 4, "De que numeros quieres conoser sus divisores:", false, ""));
    print.template("Esta son los divisores del @c4@v0", true, num);
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        print.template("@c4@v0 ", false, i);
      }
    }
  }
}
