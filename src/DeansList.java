import java.util.ArrayList;
import java.util.Collections;

public class DeansList implements ICollection{
    private ArrayList<Object> listName=new ArrayList<>();
    private ArrayList<String> listGpa=new ArrayList<>();

    public DeansList(){
    }
    public DeansList(ArrayList<Object> studentName, ArrayList<String > studentGpa){
    add(studentGpa);
    add(studentName);
    }
    @Override
    public boolean add(Object newItem) {
        if((double)newItem>=3.7){
            listName.add((String)newItem);
            listGpa.add((String)newItem);
            return true;
        }
        else
            return false;
    }
    @Override
    public Object getNext() {
        return listName.remove(listGpa.indexOf(Collections.max(listGpa)));
    }
}
