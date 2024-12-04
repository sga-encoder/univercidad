package Juegos.MasterMind.v02;

import java.util.ArrayList;
import java.util.Arrays;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    print.template("Bienvenido a MasterMind", true, "");
    boolean continuePlay = true;

    while (continuePlay) {
      String code = "";
      int size = 4;
      String puzzle = numberGenerator(size);

      while (!code.equals(StringFiller("", size, '*'))) {

        code = StringFiller("", size, '0');

        String input = print.template(true, 2, "", false, "");

        input = StringFiller(input, size, '0');

        code = trackEncoder(puzzle, input, size);

        print.template("@v0 @v1", true, input, trackDecoder(code, size));

      }

      String answer = print.template(true, 2, "¡Lo has ganado!\nQuieres Seguir jugando? (S/N): ", false, "");
      if (answer.equalsIgnoreCase("n")) {
        continuePlay = false;
      }
    }
  }

  public static String numberGenerator(int size) {
    Integer[] arrayNumbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ArrayList<Integer> listNumbers = new ArrayList<>(Arrays.asList(arrayNumbers));
    String randomNumber = "";
    for (int i = 0; i < size; i++) {
      int index = 0;
      boolean isMayor = false;
      do {
        index = (int) (Math.random() * 9 - i);
        if (index > 0) {
          isMayor = true;
        }
      } while (!isMayor);

      randomNumber += listNumbers.get(index);
      listNumbers.remove(index);
    }
    return randomNumber;
  }


  // verifica si un String tiene X(size) de caracteres y si tene menos de X(size)
  // completa la cadena con un caracter
  public static String StringFiller(String string, int size, char fillChar) {
    int inputLength = string.length();
    if (inputLength != size) {
      for (int i = 0; i < size - inputLength; i++) {
        string = fillChar + string;
      }
    }
    return string;
  }

  public static String trackEncoder(String stringGame, String stringPlayer, int size) {
    String track = StringFiller("", size, '0');
    for (int i = 0; i < size; i++) {
      // si el caracter en la posicion i del input es igual al caracter en la misma
      // posicion del puzzle significa que el numero esta en la posicion correcta y
      // por lo tanto es un "Muerto" entonces en la posicion i del control se coloca
      // un "*"
      if (stringGame.charAt(i) == stringPlayer.charAt(i)) {
        track = updateTrackAtIndex(track, '*', i);
      } else {
        for (int j = 0; j < size; j++) {
          // si el caracter en la posicion i del input es igual al caracter en la posicion
          // j del puzzle significa que el numero esta en el puzzle pero no en la posicion
          // correcta entonces en la posicion i del control se cuenta la cantidad de veces
          // que aparece el caracter en la posicion i del puzzle
          if (stringGame.charAt(i) == stringPlayer.charAt(j)) {
            track = updateTrackAtIndex(track, i);
          }
        }
      }
    }
    return track;

  }

  // genera un String de con todas las pistas
  public static String trackDecoder(String code, int size) {
    String result = "";
    for (int i = 0; i < size; i++) {
      if (code.charAt(i) != '*' && code.charAt(i) != '0') {
        result += '*';
      }
    }
    for (int i = 0; i < size; i++) {
      if (code.charAt(i) == '*') {
        result += 'X';
      }
    }
    return result;
  }

  public static String updateTrackAtIndex(String track, char value, int index) {
    return track.substring(0, index) + value + track.substring(index + 1);
  }

  public static String updateTrackAtIndex(String track, int index) {
    int num = track.charAt(index) - '0';
    return updateTrackAtIndex(track, (char) (num + 1), index);
  }

}