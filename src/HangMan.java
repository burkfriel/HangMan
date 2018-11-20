

import java.util.Scanner;

public class HangMan {

    public static void main(String[] largs) {

        String again;
        int numberoftries;
        numberoftries = 6;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String guessedLetter;
        int playerscore;
        int computerscore;
        playerscore = 0;
        computerscore = 0;







        System.out.println("This is a Hang man game");
        System.out.println("Guess a letter I will tell you if it is wrong.");
        guessedLetter = keyboard.nextLine();


      do {

          displayHangman(0);
          if (checkLetter(guessedLetter, "color")) {
              System.out.println("That is right");
              playerscore+=1;
          }
          again = "";
          System.out.println("Your score is "+playerscore+" my score is "+computerscore+".");
          System.out.println("Would you like to play again yes or no.");
          again = keyboard.next().toLowerCase();

      }while (again.equals("yes"));
        System.out.println("Your final score was "+playerscore+".");
        System.out.println("My final score was "+computerscore+".");
        System.out.println("Thank you for playing Hang Man.");







    }

    public static boolean checkLetter(String letter, String secretWord){
        if(secretWord.contains(letter)){
            return true;
        }
        else{
            return false;
        }
    }
    public static int gameover (Scanner keyboard) {
        for (int i = 0; i < 2; i++) {
            gameover(i);
        }
        switch (keyboard.nextLine()){
            default:
                return 1;
        }
    }
    public static int display (Scanner keyboard){
        for (int i =0; i < 7; i++){
            displayHangman(i);
        }
        switch (keyboard.nextInt()){
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                return 6;

        }


    }

    public static void displayHangman(int tries){
        switch (tries){
            case 0:
                System.out.println("  +---------");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                break;
            case 1:
                System.out.println("  +---------");
                System.out.println("  0        |");
                System.out.println("           |");
                System.out.println("           |");
                break;
            case 2:
                System.out.println("  +---------");
                System.out.println("  0        |");
                System.out.println("  |        |");
                System.out.println("           |");
                break;
            case 3:
                System.out.println("  +---------");
                System.out.println("  0        |");
                System.out.println("  |        |");
                System.out.println(" /         |");
                break;
            case 4:
                System.out.println("  +---------");
                System.out.println("  0        |");
                System.out.println("  |        |");
                System.out.println(" / \\       |");
                break;
            case 5:
                System.out.println("  +---------");
                System.out.println("\\ 0 /       |");
                System.out.println("  |         |");
                System.out.println(" / \\        |");
                break;
            case 6:
                System.out.println("  +---------");
                System.out.println("\\ 0 /      |");
                System.out.println("  |        |");
                System.out.println(" / \\       |");
                break;


        }
    }
    public static void gameover(int gameOver){
        switch (gameOver){
            case 1:
                System.out.println("  _____                         ____                 ");
                System.out.println(" / ____|                       / __ \\                ");
                System.out.println("| |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __ ");
                System.out.println("| | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__|");
                System.out.println("| |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |   ");
                System.out.println(" \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|   ");


        }
    }



}
