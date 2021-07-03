import java.util.ArrayList;

public class ClientService implements ICollection{
    private ArrayList<String> clientName;

    public ClientService(){
    }
    public ClientService(int maximumNumberOfClients) throws IllegalArgumentException{
            if (maximumNumberOfClients <= 0) {
                throw new IllegalArgumentException("Maximum Number Of Clients should >0.");
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
