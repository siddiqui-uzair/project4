import java.util.Random;
import java.util.Scanner;

public class CoinItem extends BagItemSuperclass {

    @Override
    public int ItemDrawn() {
        System.out.println("Oh no! You drew a coin and need to flip it. Call...\n[H]eads\n[T]ails");

        Scanner scanner = new Scanner(System.in);
        String userGuess = scanner.next();

        Random random = new Random();
        int coinResult = random.nextInt(2);

        if ((userGuess.equalsIgnoreCase("H") && coinResult == 0) || (userGuess.equalsIgnoreCase("T") && coinResult == 1)) {
            System.out.println("Phew! You guessed right! Nothing happens...");
            return 0; 
        } else {
            System.out.println("Oh no, you guessed wrong. Your bust total is increased by 2...");
            return 2; 
        }
    }
}