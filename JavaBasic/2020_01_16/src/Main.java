import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        TravelCustomer travelCustomer1 = new TravelCustomer("Lee", 40, 100);
        TravelCustomer travelCustomer2 = new TravelCustomer("Kim", 20, 100);
        TravelCustomer travelCustomer3 = new TravelCustomer("Hong", 13, 50);

        ArrayList<TravelCustomer> travelCustomerArrayList = new ArrayList<TravelCustomer>();

        travelCustomerArrayList.add(travelCustomer1);
        travelCustomerArrayList.add(travelCustomer2);
        travelCustomerArrayList.add(travelCustomer3);


        //print all traveler
        travelCustomerArrayList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        //print total price of all traveler
        int total = travelCustomerArrayList.stream().mapToInt(c -> c.getPrice()).sum();

        System.out.println(total);

        //get traveler over 20 age and sort and print
        travelCustomerArrayList.stream().filter(a -> a.getAge() >= 20).map(c -> c.getName()).forEach(s -> System.out.println(s));
    }
}
