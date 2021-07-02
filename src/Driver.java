public class Driver {
    public static void main(String[] args) {
        ClientService impl=new ClientService();
        impl.add(12);
        impl.getNext();
    }
}
