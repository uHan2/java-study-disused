import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Customer customer1 = new Customer("James", "1");
        Customer customer2 = new Customer("Alice", "2");
        Customer customer3 = new GOLDCustomer("Scott", "3");
        Customer customer4 = new GOLDCustomer("Raymond", "4");
        Customer customer5 = new VIPCustomer("Zeus", "5");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        for (Customer customer : customerList)
        {
            customer.calcPrice(10000);
            customer.showCustomerInfo();
            System.out.println();
        }
    }
}
