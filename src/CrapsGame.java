import java.util.Random;
import java.util.Scanner;
public class CrapsGame {
    public static void main(String[] args) {
        int roll, rollAgain;
        int die1 = 0;
        int die2 = 0;
        int rollValue = 0;
        int point = 0;
        boolean playAgain = true;
        boolean rollingForPoints = false;
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Craps Game!");
        System.out.println("To win roll a 7 or 11.");
        do {
            Default:
            System.out.println("Roll of " + rollValue);
            point = rollValue;
            rollingForPoints = true;
            System.out.println("Rolling for point " + point);
            do {
                die1 = rnd.nextInt(5) + 1;
                die2 = rnd.nextInt(5)+ 1;
                rollValue = die1 + die2;
                switch (rollValue) {};
                roll = die1 + die2;
                System.out.println("Roll is: " + roll);
                if (roll == 2 || roll == 3 || roll == 12) {
                    System.out.println("You crapped out! You LOST!");
                }
                if (roll == 7 || roll == 11) {
                    System.out.println("You rolled a natural! You WIN!");}
                if (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10); {
                System.out.println("You're trying for a point. Roll Again!");}
            } while (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10);
            System.out.println ("Play again? (Y/N)");
            playAgain = sc.nextLine().equalsIgnoreCase("Y");
        } while (playAgain);
        sc.close();
    }
}