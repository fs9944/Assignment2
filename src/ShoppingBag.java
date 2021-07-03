public class ShoppingBag implements ICollection {
    private String[] shoppingBagItem;
    private int addCount=1;
    private int getCount=1;

    public ShoppingBag() {
    }
    public ShoppingBag(int shoppingBagLength) throws IllegalArgumentException{
        if (shoppingBagLength <= 0) {
            throw new IllegalArgumentException("The size of bag should >0.");
        }
        this.shoppingBagItem = new String[shoppingBagLength];
    }
    @Override
    public boolean add(Object newItem) {
        shoppingBagItem[addCount-1] = (String) newItem;
        addCount++;
        return true;
    }
    @Override
    public Object getNext() {
        String next = null;
        next = shoppingBagItem[shoppingBagItem.length - getCount];
        shoppingBagItem[shoppingBagItem.length - getCount]=null;
        getCount++;
        return next;
    }
}
