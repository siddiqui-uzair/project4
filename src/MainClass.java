import java.util.ArrayList;
import java.util.Scanner;

public class MainClass
{
	//DO NOT CHANGE THE REFERENCE TYPE IN THE LINE BELOW!
	private static ArrayList<BagItemSuperclass> items = new ArrayList<BagItemSuperclass>();
	
	public static void main(String[] args)
	{
		//STEP 0:
		//You should setup any required local variables here.
		
		System.out.println("Welcome to the Mystery Bag Game! Your aim is to draw all the items in the bag without going bust!");
		System.out.println("[E]asy");
		System.out.println("[M]edium");
		System.out.println("[D]ifficult");		
		
		//STEP 1:
		//Based on the user input you should respond to difficulty and fill the bag.
		//You should use the correct GenerateNewBagItem() method to get each random item.
		
		
		while(                       )
		{
			//STEP 2:
			//You should draw repeatedly here until the player has emptied the bag
			//or until they've gone bust!
		}
		
		//STEP 3:
		//Tell the players how they've done!
		
		//Remember to close any streams!
	}
	
	public static BagItemSuperclass GenerateNewBagItem()
	{
		//You should return the correct instantiated object from here.
	}
	
	public static BagItemSuperclass GenerateNewBagItem(double diceChance)
	{
		double val = Math.random(); //Returns a double type number greater than or equal to 0.0 and less than 1.0
		
		//You need to compare val with the parameter diceChance to decide if you should return a DiceItem object or 
		//a BlankItem object
	}
	
	/**
	 * 
	 * You will require a third overloaded method for Difficulty #3: Difficult 
	 * 
	 */
	
	//Refer to the coursework specification for more!
}
