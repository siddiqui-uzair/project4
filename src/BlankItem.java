public class BlankItem extends BagItemSuperclass {
    @Override
    public int ItemDrawn() {
        System.out.println("Phew! You drew a blank token! Nothing happens...");
        return 0; 
    }
}