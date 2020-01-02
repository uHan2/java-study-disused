public class Card
{
    private int cardNum;
    private static int serialNum = 10000;

    Card()
    {
        serialNum++;
        cardNum = serialNum;
    }

    public int getCardNum()
    {
        return cardNum;
    }

}
