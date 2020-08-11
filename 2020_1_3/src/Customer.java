public class Customer
{
    protected String customerGrade;
    private String customerName;
    private double bonusRatio;
    protected int bonusPoint;
    private String customerID;
    double normalPrice;

    public Customer(String customerName, String customerID)
    {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public void calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        this.normalPrice = price;
    }

    public void showCustomerInfo()
    {
        System.out.println("Name : " + customerName);
        System.out.println("Grade : " + customerGrade);
        System.out.println("Normal Price : " + normalPrice);
        System.out.println("Bonus Point : " + bonusPoint);
    }


}
