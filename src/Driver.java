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

        int maxNumList = 4;
        Student Alice = new Student("Alice", 5.0);
        Student John = new Student("John", 4.5);
        Student Lee = new Student("Lee", 3.0);
        Student Kate = new Student("Kate", 4.0);

        DeansList Deanslist = new DeansList(maxNumList);
        System.out.println(Deanslist.add(Alice.getGpa())+ " " + Alice.getName() );
        System.out.println(Deanslist.add( John.getGpa())+ " " + John.getName());
        System.out.println(Deanslist.add(  Lee.getGpa())+ " "+ Lee.getName());
        System.out.println(Deanslist.add( Kate.getGpa())+ " " + Kate.getName());

        System.out.println(Deanslist.getNext());
        for (int i = 0; i < maxNumList; i++)
            System.out.println(Deanslist.getNext());
        System.out.println("-------------------------------------------------");

    }
}

