public class Main
{
    public static void main(String[] args)
    {
        CardCompany company = CardCompany.getCompany();

        Card myCard = company.createCard();
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNum());
        System.out.println(yourCard.getCardNum());




    }
}
