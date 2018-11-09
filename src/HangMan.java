import java.util.Scanner;

public class HangMan {

    public static void main(String[] largs) {

        boolean guessedletters;
        int numberofwords;
        int numberofletters;
        int numberoftries;
        numberoftries = 6;
        numberofwords = 3;
        Scanner keyboard;
        boolean guessedletter;
        keyboard = new Scanner(System.in);
        boolean word;
        String guessedLetter;



        System.out.println("This is a Hang man game");
        System.out.println("Guess a letter I will tell you if it is wrong.");
        guessedLetter = keyboard.nextLine();
        guessedLetter=guessedletter;

        if (guessedletter = word){


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
