package EstructurasRepetitivas.SuavizadoDeCurvas;
import utilities.Printer;
public class index {
  public static void main(String[] args) {
    Printer print = new Printer();
    int numData = Integer.parseInt(print.template(true, 2, "cuantos datos desea prosesar? :", false, ""));
    String data = print.template(true, 0, "ingrese los datos separado por espacios: ", false, "") + " ";

    int counter = 0;
    double aux1 = 0, aux2 = 0, aux3 = 0;
    String aux = "";
    String out = "";
    double promedio = 0;
    boolean isTime = false;

    for (int i = 0; i < data.length(); i++) {
      if (data.charAt(i) == ' ') {
        counter++;
        aux3 = aux2;
        aux2 = aux1;
        aux1 = Double.parseDouble(aux);
        aux = "";
        isTime = true;
      }
      if (counter >= 3 && isTime) {
        promedio = (aux1 + aux2 + aux3) / 3;
        isTime = false;
        out += promedio + " ";
      }
      if ((counter == 1  && isTime) || counter == numData) {
        out += aux1 + " ";
        isTime = false;
      }
      aux += data.charAt(i);
    }
    print.template("out: @v0" , false, out);
  }
}