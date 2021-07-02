import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class ShoppingBag implements ICollection{
    private Arrays[] shoppingBagItem;

    public ShoppingBag(){
    }
    public ShoppingBag(Arrays[] shoppingBagItem){
        this.shoppingBagItem=shoppingBagItem;
    }
    public ShoppingBag(Arrays[] shoppingBagItem, int shoppingBagSize) {
        if (shoppingBagSize <= 0) {
            throw new InputMismatchException("The size of bag should >0.");
        }
        this.shoppingBagItem=shoppingBagItem;
    }
    @Override
    public boolean add(Object newItem) {
        List<String> shopList=new ArrayList(Arrays.asList(shoppingBagItem));
        shopList.add((String) newItem);
        return true;
    }
    @Override
    public Object getNext() {
        List<String> shopList=new ArrayList(Arrays.asList(shoppingBagItem));
        return shopList.remove(shopList.size()-1);
    }
}
