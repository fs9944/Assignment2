import java.util.ArrayList;
import java.util.Collections;

public class DeansList implements ICollection{
//    private ArrayList<Object> deansList=new ArrayList<>();
    private ArrayList<Double> listGpa=new ArrayList<>();
    private ArrayList<String> listName=new ArrayList<>();
    private String studentName;
    private double studentGpa;
    private int counterName;
    private int counterGpa;

    public DeansList(){
    }
    public DeansList(int numberOfDeansList) {
    }

    @Override
    public boolean add(Object newItem) {
        if((Double)newItem>=3.7) {
            listGpa.add((Double)newItem);
            return true;
        }
        else
            return false;
    }
    @Override
    public Object getNext() {
        if(listGpa.size()==0)
            return false;
        else
        return listGpa.remove(listGpa.indexOf(Collections.max(listGpa)));
    }
}
