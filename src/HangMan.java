public class HangMan {

    public static void main(String[] largs) {

        String guessedletters;
        int numberofwords;
        int numberofletters;
        int numberoftries;
        numberoftries = 6;
        numberofwords = 3;



        System.out.println("This is a Hang man game");

        for (int i =0; 1 < 6; i++){
            displayHangman(i);
        }






    }
    public static int display (Scanner keyboard){
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
            case 6:
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
                System.out.println(" / \\      |");
                break;
            case 5:
                System.out.println("  +---------");
                System.out.println("\\ 0       |");
                System.out.println("  |        |");
                System.out.println(" / \\      |");
                break;
            case 6:
                System.out.println("  +---------");
                System.out.println("\\ 0 /     |");
                System.out.println("  |        |");
                System.out.println(" / \\      |");
                break;


        }
    }


}
