import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());
            String order = str.nextToken();

            if (order.contains("push"))
            {
                stack.push(Integer.parseInt(str.nextToken()));
            } else if (order.equals("pop"))
            {
                if (stack.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(stack.pop());
                }
            } else if (order.equals("size"))
            {
                System.out.println(stack.size());
            } else if (order.equals("empty"))
            {
                if (stack.isEmpty())
                {
                    System.out.println("1");
                } else
                {
                    System.out.println("0");
                }
            } else if (order.equals("top"))
            {
                if (stack.isEmpty())
                {
                    System.out.println("-1");
                } else
                {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}