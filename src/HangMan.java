

import java.util.Scanner;

public class HangMan {

    public static void main(String[] largs) {

        boolean again;
        int numberoftries;
        numberoftries = 6;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String guessedLetter;
        int playerscore;
        int computerscore;
        playerscore = 0;
        computerscore = 0;
        String againn;
        String phrase;
        int wrong;
        String secretWord;
        boolean guessedWord;
        String Alphabet;







        System.out.println("This is a Hang man game");



      do {//main game loop
            secretWord = "elephant";
          phrase=createLines(secretWord);
            wrong = 0;
            again = false;
            guessedWord=false;
            Alphabet= "";
          //game core loop - game itself
          while (wrong<numberoftries &&!guessedWord) {
              System.out.println("Guess a letter I will tell you if it is wrong.");
              System.out.println("HINT: It is animal");

              System.out.println(phrase);
              guessedLetter = keyboard.nextLine();

              if (checkLetter(guessedLetter, secretWord)) {
                  System.out.println("That is right");
                 phrase=enterGuessIntoGuessPhrase(secretWord, guessedLetter, phrase);
              } else {
                  System.out.println("That is wrong.");
                  wrong++;

              }


              if (secretWord.equals(phrase)){
                  guessedWord=true;
                  playerscore++;
              }

              displayHangman(wrong);
              Alphabet=Alphabet+guessedLetter;
              System.out.println(Alphabet);





          }
          gameover(1);



          againn = "";
          System.out.println("Your score is "+playerscore+" my score is "+computerscore+".");
          System.out.println("Would you like to play again yes or no.");
          againn = keyboard.next().toLowerCase();
          keyboard.nextLine();

      }while (againn.equals("yes"));
        System.out.println("Your final score was "+playerscore+".");
        System.out.println("My final score was "+computerscore+".");
        System.out.println("Thank you for playing Hang Man.");







    }
    public static String createLines(String word){
        String dashedLines="";
        for(int i=0;i<word.length();i++){
            dashedLines=dashedLines+"-";
        }
        return dashedLines;
    }

    public static String enterGuessIntoGuessPhrase(String word, String guess, String guessPhrase){
        for(int position = 0; position<word.length(); position ++){
            if(guess.charAt(0)==word.charAt(position)){
                guessPhrase = guessPhrase.substring(0, position)+guess+
                        guessPhrase.substring(position+1);
            }
        }
        return guessPhrase;

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
                System.out.println("\\ 0         |");
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
