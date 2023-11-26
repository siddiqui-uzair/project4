import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class MainClass {
    private static ArrayList<BagItemSuperclass> items = new ArrayList<BagItemSuperclass>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            playGame();
            System.out.println("Do you want to play again? (Y/N)");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("Y")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        }
        scanner.close();
    }
    private static void playGame() {
        int numDraws = 0;
        int currBustValue = 0;
        int bustAmount = 6;

        System.out.println("Welcome to the Mystery Bag Game! Your aim is to draw all the items in the bag without going bust!");
        System.out.println("[E]asy");
        System.out.println("[M]edium");
        System.out.println("[D]ifficult");

        String select = scanner.next().toUpperCase();

        if (select.equals("E")) {
            System.out.println("Easy! Adding five items...");
            for (int i = 0; i < 5; i++) {
                items.add(GenerateNewBagItemEasy());
            }
            System.out.println("Done!");
        } else if (select.equals("M")) {
            System.out.println("Medium! Adding seven items...");
            for (int i = 0; i < 7; i++) {
                items.add(GenerateNewBagItemMedium());
            }
            System.out.println("Done!");
        } else if (select.equalsIgnoreCase("D")) {
            System.out.println("Difficult! Adding nine items...");
            for (int i = 0; i < 9; i++) {
                items.add(GenerateNewBagItemDifficult());
            }
            System.out.println("Done!");
            
        } else {
            System.out.println("Invalid Option Selected. Exiting...");
            System.exit(0);
        }

        while (numDraws < items.size() && currBustValue < bustAmount) {
            System.out.println("Time to draw! You are on draw " + (numDraws + 1) + " of " + items.size());
            System.out.println("Your current bust value is " + currBustValue + " of " + bustAmount);
            System.out.println("Type anything to draw...");

            scanner.nextLine();

            scanner.nextLine();

            BagItemSuperclass drawnItem = items.get(numDraws);

            int drawResult = drawnItem.ItemDrawn();

            currBustValue += drawResult;

            if (currBustValue >= bustAmount) {
                System.out.println("Game Over! You went bust on draw " + (numDraws + 1) + " of " + items.size());
                break;
            }

            numDraws++;
            scanner.nextLine();
        }

        if (numDraws == items.size()) {
            System.out.println("Game Over! You drew all the items! Well done!");
        } else {
            System.out.println("Game Over! You reached the bust amount. Better luck next time!");
        }

        items.clear();
    }

	public static BagItemSuperclass GenerateNewBagItemEasy() {
        return new BlankItem();
    }

    public static BagItemSuperclass GenerateNewBagItemMedium() {
        double randomValue = Math.random();
        if (randomValue < 0.7) {
            return new BlankItem();
        } else {
            return new DiceItem();
        }
    }
    public static BagItemSuperclass GenerateNewBagItemDifficult() {
        Random random = new Random();
        double randomValue = random.nextDouble();

        if (randomValue < 0.4) {
            return new BlankItem();
        } else if (randomValue < 0.6) {
            return new DiceItem();
        } else {
            return new CoinItem();
        }
    }

    public static BagItemSuperclass GenerateNewBagItem(double diceChance){
    	Random random = new Random();
        double val = random.nextDouble();
		 if (val >= diceChance) {
		        return new DiceItem();
		    } else {
		        return new BlankItem();
		    }	
	}
}
