public class Tom extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Start Save Money");
        Main.myBank.saveMoney(3000);
        System.out.println("End Save Money");
        System.out.println("Money : " + Main.myBank.getMoney());

    }
}
