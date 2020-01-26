public class Bank
{
    private int money = 10000;

    public int getMoney()
    {
        return money;
    }

    public void saveMoney(int save)
    {

        synchronized (this)
        {
            int m = this.getMoney();

            try
            {
                Thread.sleep(3000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            this.money = m + save;
        }
    }

    public void useMoney(int use)
    {
        synchronized (this)
        {
            int m = this.getMoney();
            try
            {
                Thread.sleep(200);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            this.money = m - use;
        }
    }
}
