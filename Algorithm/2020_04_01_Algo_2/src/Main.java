import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        int num = 0;

        for (int i = 0; i < tc; i++)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());
            String order = str.nextToken();

            if (order.contains("push"))
            {
                num = Integer.parseInt(str.nextToken());
                queue.add(num);
            } else if (order.equals("pop"))
            {
                if (queue.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(queue.poll());
                }
            } else if (order.equals("size"))
            {
                System.out.println(queue.size());
            } else if (order.equals("empty"))
            {
                if (queue.isEmpty())
                {
                    System.out.println("1");
                } else
                {
                    System.out.println("0");
                }
            } else if (order.equals("front"))
            {
                if (queue.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(queue.peek());
                }
            } else if (order.equals("back"))
            {
                if (queue.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(num);
                }
            }
        }
    }
}