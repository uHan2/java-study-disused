import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<>();

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());

            String order = str.nextToken();

            if (order.contains("push_front"))
            {
                deque.addFirst(Integer.parseInt(str.nextToken()));
            } else if (order.contains("push_back"))
            {
                deque.addLast(Integer.parseInt(str.nextToken()));
            } else if (order.contains("pop_front"))
            {
                if (deque.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(deque.pollFirst());
                }
            } else if (order.contains("pop_back"))
            {
                if (deque.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(deque.pollLast());
                }
            } else if (order.contains("size"))
            {
                System.out.println(deque.size());
            } else if (order.contains("empty"))
            {
                if (deque.isEmpty())
                {
                    System.out.println("1");
                } else
                {
                    System.out.println("0");
                }
            } else if (order.contains("front"))
            {
                if (deque.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(deque.peekFirst());
                }
            } else if (order.contains("back"))
            {
                if (deque.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(deque.peekLast());
                }
            }
        }
    }
}