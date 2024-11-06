package CalculadorDePi;

public class index {
  public static void main(String[] args) {
    final int PRECICION = 100000;
    double pi = 0;
    int counter = 0;
    for (int n = 0; n < PRECICION; n++) {
      double a = Math.pow(-1, n);
      double b = (2 * n) + 1;
      pi += a / b;
      if (counter > 500) {
        counter = 0;
        System.out.println("pi: " + pi*4);
      }
      counter++;
    }
  }
}
