public class Main extends Thread
{
    int start;
    int end;
    int total;

    public Main(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public void run()
    {
        for (int i = start; i <= end; i++)
        {
            total += i;
        }
    }

    public static void main(String[] args)
    {
        Main test1 = new Main(1, 50);
        Main test2 = new Main(51, 100);

        test1.start();
        test2.start();

        try
        {
            test1.join();
            test2.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        int total = test1.total + test2.total;

        System.out.println("test1 total : " + test1.total);
        System.out.println("test2 total : " + test2.total);

        System.out.println("total : " + total);
    }
}