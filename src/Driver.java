import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int maxNumClient=3;
        ClientService clientListOfBank=new ClientService(maxNumClient);
        for (int i=0;i<maxNumClient;i++)
            System.out.println(clientListOfBank.add("client"+(i+1)));
        for (int i=0;i<maxNumClient;i++)
            System.out.println("The next client is "+clientListOfBank.getNext());
            System.out.println("-------------------------------------------------");

        int maxNumBag=4;
        ShoppingBag shopping=new ShoppingBag(maxNumBag);
        for(int i=0;i<maxNumBag;i++)
            System.out.println(shopping.add("apple"+(i+1)));
        for (int i=0;i<maxNumBag;i++)
            System.out.println("Take out "+shopping.getNext()+" from the bag");






    }
}
