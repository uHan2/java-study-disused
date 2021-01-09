public class main
{
    public static void main(String[] args)
    {
        Order order1 = new Order();

        order1.setOrderInfo("201907210001", "abc123", "2019년 7월 21일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");

        order1.showInfo();

    }
}
