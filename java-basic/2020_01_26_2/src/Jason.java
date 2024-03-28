public class Jason extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Start Using Money");
        Main.myBank.useMoney(200);
        System.out.println("End Using Money");
        System.out.println("Money : " + Main.myBank.getMoney());
    }
}
