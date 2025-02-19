import java.util.Random;
import java.util.Scanner;
public class CrapsGame {
    public static void main(String[] args) {
        Random random = new Random();
        int roll = random.nextInt(12) + 2;
        int playerRoll= 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Craps Game!");
        do {
            System.out.println("Press 1 to roll.");
            playerRoll = sc.nextInt();
            System.out.println("Roll is: " + roll);
            if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("You crapped out! You LOST!");
            }
            if (roll == 7 || roll == 11) {
                System.out.println("You rolled a natural! You WIN!");
            }
        } while (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10 || roll == 11);
        {System.out.println("Play again? (Y/N)");}



    }
}