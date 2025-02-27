import java.util.Random;
import java.util.Scanner;
public class CrapsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int roll = (int) (Math.random()* 12 + 2);
        int rollAgain = (int) (Math.random()* 12 + 2);
        String playerRoll= "R" ;
        boolean playAgain = true;
        System.out.println("Welcome to the Craps Game!");
        System.out.println("To win roll a 7 or 11.");
        do {
            do {
                System.out.println("Press R to roll.");
                playerRoll = sc.nextLine();
                roll = roll;
                System.out.println("Roll is: " + roll);
                if (roll == 2 || roll == 3 || roll == 12) {
                    System.out.println("You crapped out! You LOST!");
                }
                if (roll == 7 || roll == 11) {
                    System.out.println("You rolled a natural! You WIN!");}
                if (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10); {
                rollAgain = roll; System.out.println("You're trying for a point. Roll Again!");}
            } while (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10);
            System.out.println ("Play again? (Y/N)");
            playAgain = sc.nextLine().equalsIgnoreCase("Y");
        } while (playAgain);
        sc.close();
    }
}