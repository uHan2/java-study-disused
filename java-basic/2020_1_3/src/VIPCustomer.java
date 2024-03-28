public class VIPCustomer extends Customer
{
    private double saleRatio;
    private double bonusRatio;
    private int agentID;
    private double discountedPrice;


    public VIPCustomer(String customerName, String customerID)
    {
        super(customerName, customerID);
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.customerGrade = "VIP";
        this.agentID = (int) (Math.random() * 100);

    }

    @Override
    public void calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        this.normalPrice = price;
        this.discountedPrice = price * (1 - saleRatio);
    }

    @Override
    public void showCustomerInfo()
    {
        super.showCustomerInfo();
        System.out.println("Discounted Price : " + discountedPrice);
        System.out.println("Your Personal Agent's ID : " + agentID);
    }
}
