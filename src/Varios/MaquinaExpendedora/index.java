package Varios.MaquinaExpendedora;

import java.util.*;
public class index {
  public static void main(String[] args) {
    // Inventario inicial
    int numPapas = 5;
    int numChocolatas = 4;
    int numMentas = 8;
    int opcion = 0;
    int totalDeProductos = numChocolatas + numPapas + numMentas;
    boolean quiereOtroProducto = true;
    String productosAdicionalesNombre = "";
    String proproductosAdicionalesCantidad = "";
    int contadorDeProductos = 3;

    Scanner input = new Scanner(System.in);
    
    String mensaje = "Máquina expendedora\n"
        + "Seleccione el producto que desea :\n"
        + " 1. Papas fritas \n"
        + " 2. Chocolatinas \n"
        + " 3. Mentas \n";

    String loSentimos = "Lo sentimos. Se agotaron las ";
    String producto = " ";
    String error = "Opción no válida. "
        + "Por favor, seleccione una opción entre 1 y 3.";

    System.out.println(mensaje);
    while (totalDeProductos > 0) {
      if (quiereOtroProducto) {
        System.out.print("Ingrese la opción: ");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion) {
          case 0:
            System.out.print("Cual es el nombre del nuevo producto");
            String nombre = input.nextLine();
            System.out.print("que cantidad ingresaste " + nombre + " en la maquina");
            String cantidad = input.nextLine();
            productosAdicionalesNombre += nombre + ',';
            proproductosAdicionalesCantidad += cantidad + ',';
            contadorDeProductos ++;
            mensaje += ' ' + contadorDeProductos + '.' + ' ' + nombre + " \n"; 
            break;
          case 1:
            producto = "papas fritas";
            if (numPapas > 0) {
              numPapas--;
              System.out.println("Entregando " + producto + " ...");
            } else {
              System.out.println(loSentimos + producto);
            }
            break;
          case 2:
            producto = "chocolatas";
            if (numChocolatas > 0) {
              numChocolatas--;
              System.out.println("Entregando " + producto + " ...");
            } else {
              System.out.println(loSentimos + producto);
            }
            break;
          case 3:
            producto = "mentas";
            if (numMentas > 0) {
              numMentas--;
              System.out.println("Entregando " + producto + " ...");
            } else {
              System.out.println(loSentimos + producto);
            }
            break;
          
          default:
            int aux = opcion - 3;
            String auxNombre1 = "", auxNombre2 = "";
            int contadorDeProductosInterno = 0;
            boolean elProductoEstaSelecionado = false;
            int i = 0;
            while (!elProductoEstaSelecionado) {
              if (productosAdicionalesNombre.charAt(i) == ',') {
                auxNombre2 = auxNombre1;
                auxNombre1 = "";
                contadorDeProductosInterno++;
              }
              auxNombre1 += productosAdicionalesNombre.charAt(i);
              if (aux == contadorDeProductosInterno) {
                elProductoEstaSelecionado = true;
              }
              i++;
            }
            if (elProductoEstaSelecionado) {
              System.out.println("Entregando " + auxNombre2 + " ...");
            }

            String auxCantidad1 = "", auxCantidad2 = "";
            int j = 0;
            int contadorDeProductosInterno2 = 0;
            int auxCantidad = 0;
            while (elProductoEstaSelecionado) {
              if (productosAdicionalesNombre.charAt(j) == ',') {
                auxCantidad2 = auxCantidad1;
                auxCantidad1 = "";
                contadorDeProductosInterno2++;
              }
              try {
                auxCantidad1 += proproductosAdicionalesCantidad.charAt(j);
              } catch (Exception e) {
                // TODO: handle exception
              }
              if (contadorDeProductosInterno2 == contadorDeProductosInterno) {
                elProductoEstaSelecionado = false;
                if (auxCantidad2.charAt(auxCantidad2.length() - 1) == ',') {
                  String aux1 = "";
                  for (int k = 0; k < auxCantidad2.length() - 1; k++) {
                    aux1 += auxCantidad2.charAt(k);
                  }
                  auxCantidad = Integer.parseInt(aux1);
                } else {
                  auxCantidad = Integer.parseInt(auxCantidad2);
                }
                auxCantidad--;
              }
              j++;
            }
            int contadorDeProductosInternoDespues = 0;
            String contadorDeProductosInternoDespuesString = "";
            int k = proproductosAdicionalesCantidad.length();
            
            while (contadorDeProductos - contadorDeProductosInterno2 - 3 != contadorDeProductosInternoDespues) {
              if (proproductosAdicionalesCantidad.charAt(k) == ',') {
                contadorDeProductosInternoDespues++;
              }
              contadorDeProductosInternoDespuesString = proproductosAdicionalesCantidad.charAt(k)
                  + contadorDeProductosInternoDespuesString;
              k--;
            }
            int contadorDeProductosInternoAntes = 0;
            String contadorDeProductosInternoAntesString = "";
            int l = 0;
            while (contadorDeProductosInterno2 - 1 != contadorDeProductosInternoAntes) {
              if (proproductosAdicionalesCantidad.charAt(l) == ',') {
                contadorDeProductosInternoAntes++;
              }
              contadorDeProductosInternoAntesString += proproductosAdicionalesCantidad.charAt(l);
              l++;
            }
            proproductosAdicionalesCantidad = contadorDeProductosInternoAntesString + auxCantidad + ","
                + contadorDeProductosInternoDespuesString;

        
            
            System.out.println(error);
            break;
        }
      }
      System.out.print("quiere agregar otro producto (S/N)");
      String respuesta = input.nextLine();
      if (respuesta.toLowerCase().equals("n")) {
        quiereOtroProducto = false;
      }
      totalDeProductos = numChocolatas + numPapas + numMentas;
    }
    input.close();
  }
}
