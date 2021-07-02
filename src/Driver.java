public class Driver {
    public static void main(String[] args) {
        ClientService clientListOfBank=new ClientService(2);
        clientListOfBank.add("client1");
        clientListOfBank.add("client2");
        clientListOfBank.add("client3");
        clientListOfBank.add("client4");
        clientListOfBank.add("client5");
        System.out.println("The next client is "+clientListOfBank.getNext());
        System.out.println("The next client is "+clientListOfBank.getNext());
        System.out.println("The next client is "+clientListOfBank.getNext());



    }
}
