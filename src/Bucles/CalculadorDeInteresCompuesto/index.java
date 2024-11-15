package Bucles.CalculadorDeInteresCompuesto;

import utilities.Printer;

public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    double invercion = Double.parseDouble(print.template(true, 4,
        "Vamos al calcular el interes de una invercion\nDame el valor de la inverciones: ", false, ""));
    int tiempo = Integer
        .parseInt(print.template(true, 4, "cuanto tiempo en meses deseas calcular la invercion", false, ""));

    final double porcentageInteres = 0.0089;
    double saldo = 0;
    // double invercionInicial = invercion;

    for (int i = 0; i < tiempo; i++) {
      double interes = invercion * porcentageInteres;
      saldo = invercion + interes;
      print.template("@v0   @v1   @v2   @v3", true, i, invercion, interes, saldo);
      invercion = saldo;
    }

  }
}
//0.8885838298356
//0.8887352547307
//0.8889466665303
//0.8892148099096
//0.8895242343146
//0.89

// 89/100 4447621171573/5000000000000 1111518512387/1250000000000 8889466665303/1000000000000 8887352547307/1000000000000 2221459574589/2500000000000