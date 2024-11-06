package JuegoNim;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    int willContinuePlaying = 1;
    final int LENGTH_OF_THE_STICK = 4;

    System.out.println(
        "vamos a jugar el Juego Nim \n Reclas: \n en el juego cada jugador tiene la optunidad de agarrar de 1 a 3 palos \n ninguno de los jugadores puede pasar de turno \n el jugador pierde si es el ultimo en cojer un palo");
   
    Scanner input = new Scanner(System.in);
    while (willContinuePlaying == 1) {
      
      System.out.print("Cual es tu nombre Jugador 1: ");
      String name1 = input.nextLine();
      System.out.print("Cual es tu nombre Jugador 2: ");
      String name2 = input.nextLine();
      System.out.print("con cuantos palos van a jugar (entre 5 y 20):");
      int totalStickys = input.nextInt();

      while (totalStickys >= 0) {
        int player1Roll, player2Roll;
        if (totalStickys != 0) {
          System.out.print("cuantos palos vas a cojer " + name1 + " recueda que solo puedes cojer hasta 3 :");
          player1Roll = input.nextInt();
          totalStickys -= player1Roll;
          System.out.println("quedan " + totalStickys + " palos");
          for (int i = 0; i < LENGTH_OF_THE_STICK; i++) {
            int row = 0;
            while (row < totalStickys) {
              System.out.print("|");
              row++;
            }
            System.out.print("\n");
          }

          if (totalStickys == 0) {
            System.out.println("el jugador " + name2 + " gana");
            System.out.println("quieres volver a jugar: 1: si 0: no");
            willContinuePlaying = input.nextInt();
          } else {
            System.out.print("cuantos palos vas a cojer " + name2 + " recueda que solo puedes cojer hasta 3 :");
            player2Roll = input.nextInt();
            totalStickys -= player2Roll;
            System.out.println(" quedan " + totalStickys + " palos");
            for (int i = 0; i < LENGTH_OF_THE_STICK; i++) {
              int row = 0;
              while (row < totalStickys) {
                System.out.print("|");
                row++;
              }
              System.out.print("\n");
            }
          }
        } else {
          System.out.println("el jugador " + name1 + " gana");
          System.out.println("quieres volver a jugar: 1: si 0: no");
          willContinuePlaying = input.nextInt();
        }
        

      }
    }
    
    input.close();
  }
}
