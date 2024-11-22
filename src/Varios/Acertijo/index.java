package Varios.Acertijo;

public class index {
  public static void main(String[] args) {
    boolean isRealy = false;
    boolean isEven = false;
    boolean is3a1 = false;
    boolean is27 = false;
    boolean areAllDifferent = true;
    int areAllDifferentInt = 0;
    int isEvenInt = 0;
    int is3a1Int = 0;
    int is27Int = 0;
    int count = 1000;
    while (!isRealy && count < 9999) {
      String countString = String.valueOf(count);
      for (int i = 0; (i < 4) && areAllDifferent; i++) {
        for (int j = 0; (j < 4) && areAllDifferent; j++) {
          if (countString.charAt(i) == countString.charAt(j) && i != j) {
            areAllDifferent = false;
          }
        }
      }

      if (!areAllDifferent) {
        areAllDifferentInt++;
      }

      if (count % 2 == 0) {
        isEven = true;
      } else {
        isEvenInt++;
      }
      int num1 = Character.getNumericValue(countString.charAt(0));
      int num2 = Character.getNumericValue(countString.charAt(2));
      if (num2 * 3 == num1) {
        is3a1 = true;
        is3a1Int++;
      } else {
        is3a1 = false;
      }
      int suma = 0;
      for (int i = 0; i < 4; i++) {
        suma += Character.getNumericValue(countString.charAt(i));
      }
      if (suma == 27) {
        is27 = true;
        is27Int++;
      }

      if (is27 && is3a1 && !isEven && areAllDifferent) {
        isRealy = true;
      }

      if (isRealy) {
        System.out.println("el numero es " + count);
      }

      isEven = false;
      is3a1 = false;
      is27 = false;
      areAllDifferent = true;
      count++;
    }
    System.out.println("- ¿Cuántos números cumplen con la primera condición?" + areAllDifferentInt +
        "\n- ¿Cuántos números cumplen con la segunda condición?" + is3a1Int +
        "\n- ¿Cuántos números cumplen con la tercera condición?" + isEvenInt +
        "\n- ¿Cuántos números cumplen con la cuarta condición?" + is27Int);

  }
}
