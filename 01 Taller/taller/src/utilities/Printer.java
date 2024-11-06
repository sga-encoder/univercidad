package utilities;
import java.util.Scanner;

public class Printer {
  public static final String RESET = "\u001B[0m";
  public static final String ROJO = "\u001B[31m";
  public static final String VERDE = "\u001B[32m";
  public static final String AMARILLO = "\u001B[33m";
  public static final String AZUL = "\u001B[34m";
  public static final String MAGENTA = "\u001B[35m";
  public static final String CIAN = "\u001B[36m";
  public static final String BLANCO = "\u001B[37m";
  public static final String[] colors = { RESET, ROJO, VERDE, AMARILLO, AZUL, MAGENTA, CIAN, BLANCO };
  private static final Scanner input = new Scanner(System.in);


  public void template(String content, boolean isNewLine, Object... variables) {
    String modifiedContent = content;
    String[] keyColors = { "@rt", "@c1", "@c2", "@c3", "@c4", "@c5", "@c6", "@c7" };

    // Reemplazar colores
    for (int i = 0; i < colors.length; i++) {
      String regex = "(?i)" + keyColors[i];
      modifiedContent = modifiedContent.replaceAll(regex, colors[i]);
    }

    // Reemplazar variables
    for (int i = 0; i < variables.length; i++) {
      String regex = "(?i)@v" + i;
      modifiedContent = modifiedContent.replaceAll(regex, String.valueOf(variables[i]));
    }

    modifiedContent += RESET;

    if (isNewLine) {
      System.out.println(modifiedContent);
    } else {
      System.out.print(modifiedContent);
    }
  }

  public String template(boolean isInput, int numColorIn, String content, boolean isNewLine, Object... variables) {
    try{
      if (isInput) {
        this.template(content, isNewLine, variables);
        System.out.print(colors[numColorIn]);
        return input.nextLine();
      } else {
        this.template(content, isNewLine, variables);
        return null;
      }
    } finally {
      System.out.print(RESET);
    }
  }

  // Método para cerrar el Scanner al final del programa
  public static void closeScanner() {
    input.close();
  }
}