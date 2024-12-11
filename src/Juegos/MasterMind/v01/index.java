package Juegos.MasterMind.v01;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    print.template("Bienvenido a MasterMind", true, "");
    boolean continuePlay = true;
    while (continuePlay) {
      int num = (int) (Math.random() * 9999) + 1000;
      // int num = 1234;
      String puzzle = String.valueOf(num);
      String control = "0000";
      while (!control.equals("****")) {

        String input = print.template(true, 2, "", false, "");

        int inputLength = input.length();

        // verifica si el input tiene 4 caracteres y si tene menos de 4 completa la
        // cadena con ceros
        if (input.length() != 4) {
          for (int i = 0; i < 4 - inputLength; i++) {
            input = "0" + input;
          }
        }

        for (int i = 0; i < 4; i++) {
          // si el caracter en la posicion i del input es igual al caracter en la misma
          // posicion del puzzle significa que el numero esta en la posicion correcta y
          // por lo tanto es un "Muerto" entonces en la posicion i del control se coloca
          // un "*"
          if (puzzle.charAt(i) == input.charAt(i)) {
            control = control.substring(0, i) + '*' + control.substring(i + 1);
          } else {
            for (int j = 0; j < 4; j++) {
              // si el caracter en la posicion i del input es igual al caracter en la posicion
              // j del puzzle significa que el numero esta en el puzzle pero no en la posicion
              // correcta entonces en la posicion i del control se cuenta la cantidad de veces
              // que aparece el caracter en la posicion i del puzzle
              if (puzzle.charAt(i) == input.charAt(j)) {
                int numAux = control.charAt(i) - '0';
                control = control.substring(0, i) + (numAux + 1) + control.substring(i + 1);
              }
            }
          }
        }

        print.template("@v0 ", false, input);
        // imprime en pantalla las pista seun lo que indica la variable control
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

        // si el control es igual a "****" significa que el usuario adivino el puzzle
        if (control.equals("****")) {
          print.template("¡Lo has ganado!", true, "");
          String answer = print.template(true, 2, "Quieres Seguir jugando? (S/N): ", false, "");
          if (answer.equalsIgnoreCase("n")) {
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