package Funciones.Fibonachi;

public class index {
  public static void main(String[] args) {
    System.out.println(fibonacci(5));
  }

  public static int fibonacci(int n) {
    if (n <= 0) {
      return 1;
    } else {
      n = fibonacci(n-1) + fibonacci(n-2);
      return n;
    }
  }
}
