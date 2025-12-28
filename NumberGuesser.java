import java.util.Random;
import java.util.Scanner;
public class NumberGuesser {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String playAgain;
        System.out.println("─────────Number guesser─────────");
        System.out.print("Do you want to play a number guessing game(Y/N):");
        playAgain = scanner.next();
        if (!playAgain.equalsIgnoreCase("Y")) {
            System.out.println("Alright! Maybe next time. Goodbye! 👋");
            scanner.close();
            return; // exit program
        }
        while (playAgain.equalsIgnoreCase("y")) {
            System.out.print("Enter the maximum number (e.g. 10, 100, 1000): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // discard invalid input
                continue;
            }
            int maxNumber = scanner.nextInt();
            if (maxNumber <= 0) {
                System.out.println("Please enter a number greater than 0.");
                continue;
            }
            int randomNumber = random.nextInt(1, maxNumber + 1);
            int maxAttempts = (int) Math.ceil(Math.log(Math.max(maxNumber, 2)) / Math.log(2));
            int guess;
            int attemptCount = 0;
            System.out.println("Your range is 1 to " + maxNumber + ".");
            System.out.println("You have " + maxAttempts + " attempt" + (maxAttempts > 1 ? "s" : "") + ".");
            while (attemptCount < maxAttempts) {
                System.out.print("Enter your guess: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number!");
                    scanner.next(); // discard invalid input
                    continue;
                }
                guess = scanner.nextInt();
                attemptCount++;
                if (guess == randomNumber) {
                    System.out.println("🎉 Correct! You guessed it in " + attemptCount + " attempt" + (attemptCount > 1 ? "s" : "") + ".");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            if(attemptCount==maxAttempts) {
                System.out.println("You ran out of attempts");
                System.out.println("The correct number was: " + randomNumber);
            }
            System.out.print("Do you want to play Again(Y/N):");
            playAgain = scanner.next();
        }
        System.out.print("Thanks for playing!\n GoodBye! Vasav😘");
    }
}
