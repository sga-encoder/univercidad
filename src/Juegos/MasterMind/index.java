package Juegos.MasterMind;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    print.template("Bienvenido a MasterMind", true, "");
    boolean continuePlay = true;
    while (continuePlay) {
      // int num = (int) (Math.random() * 9999) + 1000;
      int num = 1234;
      String puzzle = String.valueOf(num);
      boolean isCorrect = false;
      while (!isCorrect) {
        int deathCount = 0;
        int knockdownCount = 0;
        String deathString = "";
        String knockdownString = "";
        String death = "";
        String knockDown = "";

        String input = print.template(true, 2, "", false, "");
        int inputLength = input.length();
        if (input.length() != 4) {
          for (int i = 0; i < 4 - inputLength; i++) {
            input = "0" + input;
          }
        }

        for (int i = 0; i < 4; i++) {
          if (puzzle.charAt(i) == input.charAt(i)) {
            deathCount++;
            death += input.charAt(i);
            deathString += "X";
          }
        }

        if (deathCount != 4) {
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
              if (puzzle.charAt(i) == input.charAt(j) && i != j) {
                knockDown += input.charAt(j);
                knockdownCount++;
              }
            }
          }
        } else {
          isCorrect = true;
        }

        if (deathCount == 0 && knockdownCount == 0) {
          print.template("@v0 0", true, input);

        } else {
          print.template("@v0 @v1 @v2", true, input, knockdownString, deathString);

        }

        if (isCorrect) {
          print.template("¡Lo has ganado!", true, "");
          String answer = print.template(true, 2, "Quieres Seguir jugando? (S/N): ", false, "");
          if (answer.equalsIgnoreCase("N")) {
            continuePlay = false;
          }
        }
      }
    }
  }
}
