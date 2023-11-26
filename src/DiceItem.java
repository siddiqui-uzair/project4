public class DiceItem extends BagItemSuperclass {
    @Override
    public int ItemDrawn() {
        int randomValue = (int) (Math.random() * 4); 
        System.out.println("You drew a four-sized die and need to roll it...");
        System.out.println("You rolled a " + randomValue + " so that will be added to your bust total!");
        return randomValue;
    }
}