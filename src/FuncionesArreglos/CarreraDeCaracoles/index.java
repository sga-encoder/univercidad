package FuncionesArreglos.CarreraDeCaracoles;

public class index {

  public static int randomMotion() {
    int number;
    int ramdomNumber1 = (int) (Math.random() * 100);
    if (ramdomNumber1 > 70 && ramdomNumber1 < 80) {
      number = 0;
    } else {
      int ramdomNumber2 = (int) (Math.random() * 25);
      number = (int) (Math.random() * ramdomNumber2);
    }
    return number;
  }

  public static void racingSimulator(String[] snails, int[] positionSnail) {
    boolean isAWinnter = false;
    String winter = "";
    int turnCounter = 0;
    while (!isAWinnter) {
      for (int i = 0; i < snails.length; i++) {
        int advance = randomMotion();
        if (positionSnail[i] + advance >= 70) {
          isAWinnter = true;
          winter += snails[i];
          positionSnail[i] += advance;
        } else {
          positionSnail[i] += advance;
        }
      }
      turnCounter++;
      terminalPrinter(snails, positionSnail, turnCounter);
    }
  }

  public static String spaceFiller(String content, int length) {
    String filler = content;
    for (int i = filler.length(); i < length; i++) {
      filler += " ";
    }
    return filler;
  }

  public static String spaceFiller(String content, int length, String symbol) {
    String filler = content;
    for (int i = filler.length(); i < length; i++) {
      filler += symbol;
    }
    return filler;
  }

  public static String tablePrinter(String[] snails, int[] positionSnail) {
    String table = "";
    for (int i = 0; i < snails.length; i++) {
      String name = snails[i] + ": " + positionSnail[i];
      table += "                                                                            ║ " + spaceFiller(name, 23)
          + "║\n";
    }
    return table;
  }

  public static String racePrinter(int[] positionSnail) {
    String race = "";
    for (int i = 0; i < positionSnail.length; i++) {
      if (positionSnail[i] == 0) {
        race += "├───┼────────────────────────────────────────────────────────────────────┼───┤                        \n"
            +
            "│" + (i + 1)
            + " ■│                                                                    │   │                        \n";
      } else if (positionSnail[i] >= 70) {
        race += "├───┼────────────────────────────────────────────────────────────────────┼───┤                        \n"
            +
            "│" + (i + 1)
            + "  │••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••│■  │                        \n";
      } else {
        race += "├───┼────────────────────────────────────────────────────────────────────┼───┤                        \n"
            +
            "│" + (i + 1) + "  │" + spaceFiller("", positionSnail[i] - 1, "•") + spaceFiller("■", 69 - positionSnail[i])
            + "│   │                        \n";
      }
    }
    return race;
  };

  public static void terminalPrinter(String[] snails, int[] positionSnail, int turn) {
    System.out.println(
        "Turno: " + turn + "\n" +
            "                                                                            ╔════════════════════════╗\n" +
            tablePrinter(snails, positionSnail) +
            "                                                                            ╚════════════════════════╝\n" +
            "                                                                                                      \n" +
            "┌───┬────────────────────────────────────────────────────────────────────┬───┐                        \n" +
            racePrinter(positionSnail) +
            "├───┼────────────────────────────────────────────────────────────────────┼───┤                        \n" +
            "└───┴────────────────────────────────────────────────────────────────────┴───┘                        \n" +
            ""

    );
  }

  public static void main(String[] args) {
    String[][] namesAndDescriptionSnails = {
        { "Relámpago",
            "Un caracol que, a pesar de su naturaleza, siempre está tratando de parecer más rápido de lo que es" },
        { "RápidoFast",
            "Un caracol siempre en posición aerodinámica, que noquiere dar la impresión de ganador … aunque no siempre lo logra." },
        { "Turbo",
            "Este es un caracol con actitud de un velocista. No siempre es tan rápido, pero se esfuerza como ninguno." },
        { "Despacito",
            "Un caracol con una actitud calmada y serena, siempre avanzando con tranquilidad, pero nunca se detiene, ¡un verdadero luchador de la paciencia!." },
        { "Velocín",
            " Un caracol con una actitud decidida y optimista, dispuesto a dar todo de sí para sorprender a sus rivales." }
    };
    String[] snails = new String[namesAndDescriptionSnails.length];
    for (int i = 0; i < namesAndDescriptionSnails.length; i++) {
      snails[i] = namesAndDescriptionSnails[i][0];
    }
    int[] positionSnail = { 0, 0, 0, 0, 0 };
    racingSimulator(snails, positionSnail);

  }
}
