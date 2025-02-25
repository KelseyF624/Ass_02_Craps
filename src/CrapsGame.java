import java.util.Random;
import java.util.Scanner;
public class CrapsGame {
    public static void main(String[] args) {
        Random random = new Random();
        int roll = random.nextInt(12) + 2;
        int rollAgain = random.nextInt(12) + 2;
        int crapsRoll;
        String playerRoll= "R" ;
        boolean playAgain = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Craps Game!");
        System.out.println("To win roll a 7 or 11.");
        do {
            do {
                System.out.println("Press R to roll.");
                playerRoll = sc.nextLine();
                crapsRoll = roll;
                System.out.println("Roll is: " + crapsRoll);
                if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                    System.out.println("You crapped out! You LOST!");
                }
                if (crapsRoll == 7 || crapsRoll == 11) {
                    System.out.println("You rolled a natural! You WIN!");}
                if (crapsRoll == 4 || crapsRoll == 5 || crapsRoll == 6 || crapsRoll == 8 || crapsRoll == 9 || crapsRoll == 10); {
                rollAgain = roll;}
            } while (crapsRoll == 4 || crapsRoll == 5 || crapsRoll == 6 || crapsRoll == 8 || crapsRoll == 9 || crapsRoll == 10);
            System.out.println ("Play again? (Y/N)");
            playAgain = sc.nextLine().equalsIgnoreCase("Y");
        } while (playAgain);
        sc.close();
    }
}