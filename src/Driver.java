/**
 *Assignment 2
 */
public class Driver {
    public static void main(String[] args) {
        int maxNumClient = 3;
        ClientService clientListOfBank = new ClientService(maxNumClient);
        for (int i = 0; i < maxNumClient; i++)
            System.out.println(clientListOfBank.add("client" + (i + 1)));
        for (int i = 0; i < maxNumClient; i++)
            System.out.println("The next client is " + clientListOfBank.getNext());
        System.out.println("-------------------------------------------------");

        int maxNumBag = 4;
        ShoppingBag shopping = new ShoppingBag(maxNumBag);
        for (int i = 0; i < maxNumBag; i++)
            System.out.println(shopping.add("apple" + (i + 1)));
        for (int i = 0; i < maxNumBag; i++)
            System.out.println("Take out " + shopping.getNext() + " from the bag");
        System.out.println("-------------------------------------------------");

        DeansList deansList=new DeansList();
        Object Alice = new Student("Alice", 5.0);
        Object John = new Student("John", 4.5);
        Object Lee = new Student("Lee", 3.0);
        Object Kate = new Student("Kate", 4.0);

        System.out.println(deansList.counter(((Student) Alice).getGpa()));
        System.out.println(deansList.counter(((Student) John).getGpa()));
        System.out.println(deansList.counter(((Student) Lee).getGpa()));
        System.out.println(deansList.counter(((Student) Kate).getGpa()));

        System.out.println(deansList.add(Alice));
        System.out.println(deansList.add(John));
        System.out.println(deansList.add(Lee));
        System.out.println(deansList.add(Kate));

        System.out.println(deansList.getNext());
        System.out.println(deansList.getNext());
        System.out.println(deansList.getNext());
        System.out.println(deansList.getNext());
        System.out.println("-------------------------------------------------");

    }
}

