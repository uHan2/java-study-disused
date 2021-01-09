import java.util.ArrayList;

public class FastLibrary
{
    ArrayList<String> books = new ArrayList<String>();

    public FastLibrary()
    {
        books.add("태백산맥 1");
        books.add("태백산맥 2");
        books.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException
    {
        Thread t = Thread.currentThread();

        while (books.size() == 0)
        {
            System.out.println(t.getName() + " is waiting");
            wait();
            System.out.println(t.getName() + " is waiting end");
        }

        String title = books.remove(0);
        System.out.println(t.getName() + " : " + title + " lend");
        return title;
    }

    public synchronized void returnBook(String title)
    {
        Thread t = Thread.currentThread();

        books.add(title);
        notifyAll();

        System.out.println(t.getName() + " : " + title + " return");
    }
}
