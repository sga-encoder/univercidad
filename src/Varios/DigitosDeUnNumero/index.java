package Varios.DigitosDeUnNumero;

import java.util.Scanner;
public class index {
  public static void main(String[] args) {
    System.out.print("Que numero quieres conoser la cantidad de digitos :");
    Scanner input = new Scanner(System.in);
    Long num = input.nextLong();
    input.close();
    if (num < 0) {
      num = num * (-1);
    }

    Long aux = num;
    int countDigit = 0;
    while (aux != 0) {
      aux = aux / 10;
      countDigit++;
    }

    System.out.println("el numero tiene " + countDigit + " digitos");
  }
}
