package Varios.ISBN;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ingresa el codigo ISBN-13 que deseas verificar: ");
    int num = Integer.parseInt(input.nextLine());
    boolean isRealy = false;
    boolean isEven = false;
    boolean is3a1 = false;
    boolean is27 = false;
    boolean areAllDifferent = true;
    int count = 0;
    while (!isRealy && count < 9999) {
      String countString = String.valueOf(count);
      for (int i = 0; (i < 4) && areAllDifferent; i++) {
        for (int j = 0; (j < 4) && areAllDifferent; j++) {
          if (countString.charAt(i) == countString.charAt(j)) {
            areAllDifferent = false;
            System.out.println("el falso");
          }
        }
      }
      if (areAllDifferent && count % 2 == 0) {
        isEven = true;
      }
      int num1 = (int) (countString.charAt(0));
      int num2 = (int) (countString.charAt(2));
      if (num1 * 3 == num2) {
        is3a1 = true;
      } else {
        is3a1 = false;
      }
      int suma = 0;
      for (int i = 0; i < 4; i++) {
        suma += (int) (countString.charAt(i));
      }
      if (suma == 27) {
        is27 = true;
      }

      if (is27 && is3a1 && isEven && areAllDifferent) {
        isRealy = true;
      }

      if (isRealy) {
        System.out.println("el numero es" + count);
      }

      isEven = false;
      is3a1 = false;
      is27 = false;
      areAllDifferent = true;
      count++;
      System.out.println(count + " isEven: " + isEven + " is3a1: " + is3a1 + " is27: " + is27 + " isReady: " +  isRealy);
    }
  }
}
