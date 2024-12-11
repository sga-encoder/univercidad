package Juegos.MasterMind;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    print.template("Bienvenido a MasterMind", true, "");
    boolean continuePlay = true;
    while (continuePlay) {
      int num = (int) (Math.random() * 9999) + 1000;
      // System.out.println(num);
      // int num = 1234;
      String puzzle = String.valueOf(num);
      String control = "0000";
      while (!control.equals("****")) {

        String input = print.template(true, 2, "", false, "");

        int inputLength = input.length();
        if (input.length() != 4) {
          for (int i = 0; i < 4 - inputLength; i++) {
            input = "0" + input;
          }
        }

        for (int i = 0; i < 4; i++) {
          if (puzzle.charAt(i) == input.charAt(i)) {
            control = control.substring(0, i) + '*' + control.substring(i + 1);
          } else {
            for (int j = 0; j < 4; j++) {
              if (puzzle.charAt(i) == input.charAt(j)) {
                int numAux = control.charAt(i) - '0';
                control = control.substring(0, i) + (numAux + 1) + control.substring(i + 1);
              }
            }
          }
        }

        print.template("@v0 ", false, input);

        for (int i = 0; i < 4; i++) {
          if (control.charAt(i) != '*' && control.charAt(i) != '0') {
            print.template("*", false, "");
          }
        }
        for (int i = 0; i < 4; i++) {
          if (control.charAt(i) == '*') {
            print.template("X", false, "");
          }
        }
        print.template("", true, "");

        if (control.equals("****")) {
          print.template("¡Lo has ganado!", true, "");
          String answer = print.template(true, 2, "Quieres Seguir jugando? (S/N): ", false, "");
          if (answer.equalsIgnoreCase("N")) {
            continuePlay = false;
          }
        }
        if (input.equals("000r")) {
          print.template("respuesta: @v0 Control: @v1", continuePlay, puzzle, control);
        }
        control = "0000";
      }
    }
  }
}
