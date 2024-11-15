package Bucles.SimuladorDeLansamientoDeDados;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int num = Integer.parseInt(print.template(true, 4, "cuanto espera obtener al lanzar los dados?: ", false, ""));
    int dado1 = 0, dado2 = 0,count = 0;
    if (num < 2 || num > 12) {
      print.template(
          "ese numero es in probable que salga ya que los unicos numeros que pueden salir deben estar entre este rango @c42@rt y @c412",
          true, "");
    } else {
      while ((dado1 + dado2) != num) {
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        print.template("Dado1: @v0 Dado2: @v1 = @v2", true, dado1, dado2, dado1 + dado2);
        count++;
      }
    }
    print.template("toco tirar el dado @v0 para tener este resultado @v1", false, count, num); 
  }
}
