package Bucles.AdivinaAdivinador;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int memory = (int) (Math.random() * 1000) + 1;
    int num = Integer.parseInt(print.template(true, 0,
        "@c1PC     :@rt En que numero estoy pensado? \n@c0Ingrese un numero entre 1 y 1000@rt\n@c3USUARIO:@rt @v0",
        false, memory));
    final int ATTEMPTS = 10;
    int count = 0;
    boolean iGuess = false;
    while (count < ATTEMPTS && !iGuess) {
      if (num == memory) {
        print.template("@c1PC     :@rt En lo correcto en ese numero estaba pensando", true, "");
        iGuess = true;
      } else if (num > memory) {
        num = Integer.parseInt(
            print.template(true, 0, "@c1PC     :@rt El numero en el que estoy pensando es menor\n@c3USUARIO:@rt ",
                false, ""));
      } else if (num < memory) {
        num = Integer.parseInt(
            print.template(true, 0, "@c1PC     :@rt El numero en el que estoy pensando es mayor\n@c3USUARIO:@rt ",
                false, ""));
      }
      count++;
    }
    if (!iGuess) {
      print.template("@c1PC     :@rt El numero era @v0", false, memory);
    }
    if (iGuess) {
      print.template("@c0Lo adivinaste en @v0", false, count);
    }
  }
}
