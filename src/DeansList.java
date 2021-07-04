import java.util.ArrayList;
import java.util.Collections;

public class DeansList implements ICollection{
    private ArrayList<Object> deansList=new ArrayList<>();

    public DeansList(){
    }

    @Override
    public boolean add(Object newItem) {

        if(((Student)newItem).getGpa()>=3.7) {
            deansList.add(newItem);
            return true;
        }
        else
            return false;
    }
    @Override
    public Object getNext() {
        if(deansList.size()==0)
            return false;
        else
            return deansList.remove(deansList.indexOf(Collections.max(deansList.getGpa())));
    }
}