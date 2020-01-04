import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Customer> silverCustomerList = new ArrayList<Customer>();
        ArrayList<Customer> goldCustomerList = new ArrayList<Customer>();
        ArrayList<Customer> vipCustomerList = new ArrayList<Customer>();

        Customer customer1 = new Customer("James", "1");
        Customer customer2 = new Customer("Alice", "2");
        Customer customer3 = new GOLDCustomer("Scott", "3");
        Customer customer4 = new GOLDCustomer("Raymond", "4");
        Customer customer5 = new VIPCustomer("Zeus", "5");

        silverCustomerList.add(customer1);
        silverCustomerList.add(customer2);
        goldCustomerList.add(customer3);
        goldCustomerList.add(customer4);
        vipCustomerList.add(customer5);

        for (Customer customer : silverCustomerList)
        {
            customer.calcPrice(10000);
            customer.showCustomerInfo();
            System.out.println();
        }

        for (Customer customer : goldCustomerList)
        {
            customer.calcPrice(10000);
            customer.showCustomerInfo();
            System.out.println();
        }

        for (Customer customer : vipCustomerList)
        {
            customer.calcPrice(10000);
            customer.showCustomerInfo();
            System.out.println();
        }
    }
}
