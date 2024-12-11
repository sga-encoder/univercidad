package Juegos.Calvo.v01;
import utilities.Printer;
import java.util.ArrayList;

public class index {

  public static void gameEnabler() {
    Printer printer = new Printer();
    printer.template("Bienvenido A Calvo\\n"+
        "Calvo es un juego de cartas donde cada jugador tiene 7 cartas en la mano\n"+
        "aparte tiene 4 cartas que no ve estas cartas se pueden ver una por turno si\n" +
        "y 4 cartas que puede ver pero solo las puede\n"+
        "modificar antes del primer turno estas solo las pueden utilizar si ya no hay\n" +
        "mas cartas para arrastar y no hay mas cartas en su mano. \n"+
        "El objetivo es quedarse sin cartas. \n" +
        "El juego consiste en que cada jugador por turno tiene que poner una carta\n" +
        "igual o mayor a la que esta en el monto y arrastar una carta del mazo. si\n"+
        "el jugador no tiene una carta mayor o igual a la que esta en el monto o no\n" +
        "tiene ningun comodin coje todo lo que esta en el monto y lo pone en su mano.\n" +
        "hay termina el turno y el siguiente jugador comienza.\n" +
        "los comodines son: \n" +   
        "2: reinicia el valor del monto a el minimo posible\n"+
        "3: refleja la carta que esta en el monto\n"+
        "10: elimina el monto del juego\n" 
    , false, "");
  }
  public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<char[]> deckShuffler = deck.deckShuffler(2); // Por ejemplo, 3 mazos


        // for (char[] card : deckShuffler) {
        //     System.out.print(card[0] + " " + card[1]+ "      ");
        // }
    }
}