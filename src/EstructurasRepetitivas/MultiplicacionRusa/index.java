package EstructurasRepetitivas.MultiplicacionRusa;
import utilities.Printer;
public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    String operation = print.template(true, 3,
        "Este programa realiza multiplicaciones por el metodo ruso \n por favor ingresa la mutiplicacion de dos digitos que deseas hacer separada por espacios: ",
        false, "") + " ";
    

    String aux = "";
    double num1 = 0, num2 = 0;
    int multiplicacion, divicion, suma = 0;

    for (int i = 0; i < operation.length(); i++) {
      if (operation.charAt(i) == ' ') {
        double num = Double.parseDouble(aux);
        num1 = num2;
        num2 = num;
        aux = "";
      }
      aux += operation.charAt(i);
    }

    multiplicacion = (int) num2;
    divicion = (int) num1;

    while (divicion != 1) {
      multiplicacion *= 2;
      divicion /= 2;
      if (divicion % 2 != 0) {
        suma += multiplicacion;
      }
    }

    print.template("el resutado de esta multiplicacion @v0 x @v1 = @v2", false, num1, num2, suma);
  }
}
