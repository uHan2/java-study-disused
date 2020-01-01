public class CardCompany
{
    private static CardCompany company = new CardCompany();

    private CardCompany()
    {

    }

    public static CardCompany getCompany()
    {
        return company;
    }

    public Card createCard()
    {
        return new Card();
    }

}
