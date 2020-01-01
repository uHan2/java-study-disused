public class Card
{
    private static int cardNum = 10000;

    public static int getCardNum()
    {
        cardNum++;
        return cardNum;
    }

}
