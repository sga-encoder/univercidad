package Varios.Factorial;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("pasame un numero un numero factorial:");
    long num = input.nextInt();
    long factorial = 1;
    input.close();
    for (long i = num; i > 0; i--) {
      factorial *= i;
    }
    System.out.println("el resultado es : " + factorial);
  }
}

// long: 20 - 2432902008176640000
