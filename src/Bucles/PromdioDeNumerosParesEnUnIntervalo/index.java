package Bucles.PromdioDeNumerosParesEnUnIntervalo;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    print.template("este programa promedia todos los numeros pares que hallan en un rango definido por usted", true, "");
    int init = Integer.parseInt(print.template(true, 2, "dame el inicion del rango: ", false, ""));
    int finish = Integer.parseInt(print.template(true, 2, "dame el final del rango: ", false, ""));
    int add = 0, count = 0;
    for (int i = init; i <= finish; i++) {
      if (i % 2 == 0) {
        count++;
        add += i;
      }
    }
    double result = (double) add/count;
    print.template("el resultado es : @c2@v0", false, result);  
    
  }
}