public class Main
{
    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException
    {
        Tom tom = new Tom();
        tom.start();

        Thread.sleep(200);

        Jason jason = new Jason();
        jason.start();
    }
}