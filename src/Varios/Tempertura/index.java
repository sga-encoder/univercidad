package Varios.Tempertura;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    double averageTemperature = 0;
    final int NUM_TEMPERATURE = 7;
    String dia = "domingo";
    System.out.println("hoy vamos a promediar la temperatura de la semana a las 5 de la mañana");
    Scanner input = new Scanner(System.in);
    System.out.print("Da la temperatura del dia " + dia + ": ");
    double temperature = input.nextDouble();
    averageTemperature += temperature;
    double aux = temperature;

    for (int i = 0; i < NUM_TEMPERATURE; i++) {
      if (i == 0) {
        dia = "lunes";
      } else if (i == 1) {
        dia = "martes";
      }else if (i == 2) {
        dia = "miercoles";
      }else if (i == 3) {
        dia = "Jueves";
      } else if (i == 6) {
        dia = "viernes";
      } else if (i == 7) {
        dia = "sabado";
      }

      System.out.print("Da la temperatura del dia " + dia+ ": ");
      temperature = input.nextDouble();
      averageTemperature += temperature;
      if (temperature > aux) {
        aux = temperature;
      }
    }
    input.close();

    System.out.println("el promedio de la temperatura es :" + averageTemperature / NUM_TEMPERATURE);
    System.out.println("la temperatura maxima fue: " + aux);
  }
}
