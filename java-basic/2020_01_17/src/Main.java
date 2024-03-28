public class Main
{
    public static void main(String[] args)
    {
        UserID user1 = new UserID();

        try
        {
            user1.setUserid(null);
        } catch (IDFormatException e)
        {
            System.out.println(e);
        }

        try
        {
            user1.setUserid("abc");
        } catch (IDFormatException e)
        {
            System.out.println(e);
        }

    }
}
