import java.util.ArrayList;
import java.util.InputMismatchException;

public class ClientService implements ICollection{
    private ArrayList<String> clientName;

    public ClientService(){
    }
    public ClientService(int maximumNumberOfClients) {
            if (maximumNumberOfClients <= 0) {
                throw new InputMismatchException("Maximum Number Of Clients should >0.");
            }
            this.clientName = new ArrayList<>();
    }
    @Override
    public boolean add(Object newItem) {
            clientName.add((String) newItem);
            return true;
    }
    @Override
    public Object getNext() {
        return clientName.remove(0);
    }
}
