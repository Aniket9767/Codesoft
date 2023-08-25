import java.util.Random;
import java.util.Scanner;

public class GuessingGame1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        System.out.println("!!##########################################!!");
				System.out.println("##                                          ##");
        System.out.println("##        This is Number Guessing Game !!   ##");
        System.out.println("##                                          ##");
        System.out.println("!!##########################################!!");
				

        while (repeat) {
            Random random = new Random();
            int random_num = random.nextInt(100) + 1;
            boolean success = false;
            int attempts = 0;

            System.out.println("\n Choose the number between 1 and 100.");
            System.out.println("You have 5 attempts to guess.");

            while (attempts < 5) {
                System.out.print("Enter your guessed Number: ");
                int my_guess = sc.nextInt();
                attempts++;

                if(my_guess< random_num){
                    System.out.println("The guessed number is Too Low");
                }
                else if (my_guess > random_num)
                {
                    System.out.println("The guessed number is Too high");
                }
                else
                {
                    success = true;
                    break;
                }
            }

            if (success)
            {
                System.out.println("Congratulations! You have guessed the correct number in " + attempts + " attempts.");
            } else
            {
               
                System.out.println("Game over!The correct number is: " + random_num);
            }

            System.out.print("Want to play again:? (yes/no): ");
            System.out.print("");

            String repeatChoice = sc.next();
            repeat = repeatChoice.equals("yes");
        }
        sc.close();
    } 
}
