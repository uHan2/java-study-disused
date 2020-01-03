public class GOLDCustomer extends Customer
{
    private double saleRatio;
    private double bonusRatio;
    private double discountedPrice;


    public GOLDCustomer(String customerName, String customerID)
    {
        super(customerName, customerID);
        bonusRatio = 0.02;
        saleRatio = 0.1;
        this.customerGrade = "GOLD";
    }

    @Override
    public void calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        this.discountedPrice = price * (1 - saleRatio);
        this.normalPrice = price;
    }

    @Override
    public void showCustomerInfo()
    {
        super.showCustomerInfo();
        System.out.println("Discounted Price : " + discountedPrice);
    }
}
