package Juegos.Calvo.v01;

import java.util.ArrayList;


public class Deck {

  public ArrayList<char[]> deckShuffler(int numberOfDecks) {

        // Definir las cartas de un solo mazo
        char[] cardSymbols = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '1', 'J', 'Q', 'K'};
        char[] cardType = { '0', '1', '2', '3' };

        ArrayList<char[]> singleDeckList = new ArrayList<>();

        // Agregar los elementos al ArrayList
        
        for (int i = 0; i < numberOfDecks; i++) {
            for (int j = 0; j < cardType.length; j++) {
                for (int k = 0; k < cardSymbols.length; k++) {
                    singleDeckList.add(new char[] { cardType[j], cardSymbols[k] });
                }
            }
        }

        ArrayList<char[]> deck = new ArrayList<>();
        int aux = singleDeckList.size();
        for (int i = aux; i > 0; i--) {
            int index = 0;
            boolean isMayor = false;
            do {
                index = (int) (Math.random() * singleDeckList.size());
                if (index >= 0) {
                    isMayor = true;
                }
            } while (!isMayor);

            deck.add(singleDeckList.get(index));
            singleDeckList.remove(index);
        }

        return deck;

    }
}