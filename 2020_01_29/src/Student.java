public class Student extends Thread
{
    @Override
    public void run()
    {


        try
        {
            String title = Main.fastLibrary.lendBook();
            sleep(5000);
            Main.fastLibrary.returnBook(title);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
