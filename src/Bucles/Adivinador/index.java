package Bucles.Adivinador;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    print.template(
        "Piensa un número entre @c11@rt y @c1100@rt: Voy a adivinarlo\nIndica si adiviné @c0(=)@rt o si el número que se debe adivinar es mayor @c0(+)@rt o menor @c0(-)@rt que mi intento. si te equivocas al dar la pista @c0(0)@rt",
        true, "");
    int numBase = (int) (Math.random() * 100) + 1;
    int aux = numBase;
    String answer = "";
    int counter = 0;
    boolean iGuess = false;
    boolean add = false;
    while (!iGuess) {
      answer = print.template(true, 0, "El número es @v0? @c0[+/-/=]", false, numBase);
      if (answer.equals("+")) {
        if (counter == 0) {
          aux = 100 - aux;
        }
        aux /= 2;
        if (aux == 0) {
          numBase += 1;
        } else {
          numBase += aux;
        }
        add = true;
      } else if (answer.equals("-")) {
        aux /= 2;
        if (aux == 0) {
          numBase -= 1;
        } else {
          numBase -= aux;
        }
        add = false;
      } else if (answer.equals("=")) {
        print.template(
            "@c0Número adivinado en @v1 intentos Bien\n@rt¡Mi número era @c1@v0@rt! - ¡Adivinado en @c1@v1@rt intentos!",
            false, numBase, counter);
        iGuess = true;
      } else if (answer.equals("0")) {
        if (add) {
          numBase -= aux;
        } else {
          numBase += aux;
        }
        aux *= 2;
      }
      counter++;
    }
  }
}
