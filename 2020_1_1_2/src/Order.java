public class Order
{
    private String orderNum;
    private String userID;
    private String orderDate;
    private String userName;
    private String orderProdNum;
    private String address;

    public void setOrderInfo(String orderNum, String userID, String orderDate, String userName, String orderProdNum, String address)
    {
        this.orderNum = orderNum;
        this.userID = userID;
        this.orderDate = orderDate;
        this.userName = userName;
        this.orderProdNum = orderProdNum;
        this.address = address;
    }

    public void showInfo()
    {
        System.out.println("주문번호 : " + orderNum);
        System.out.println("주문자 아이디 : " + userID);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문자 이름 : " + orderNum);
        System.out.println("주문 상품 번호 : " + orderProdNum);
        System.out.println("배송 주소 : " + address);
    }
}
