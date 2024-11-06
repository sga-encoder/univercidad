package NumerosDeAmstrom;

import utilities.Printer;


public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int numDig = Integer.parseInt(
        print.template(true, 3, "De cuantos dijitos son los @c1numeros de Amstrom@rt que quieres conoser: ", false));
    int numberOflaps = 1;
    for (int i = 0; i < numDig; i++) {
      numberOflaps *= 10;
    }
    
    for (int i = numberOflaps/10; i < numberOflaps; i++) {
      String digits = String.valueOf(i);
      int counter = 0;
      for (int j = 0; j < digits.length(); j++) {
        char digit = digits.charAt(j);
        int num = digit - '0';
        counter += Math.pow(num, numDig);
      }
      
      if (counter == i) {
        print.template(" @v0", false, counter);
      }
    }
    Printer.closeScanner();
  }
}