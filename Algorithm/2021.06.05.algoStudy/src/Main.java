import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.contains("push"))
            {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (s.contains("pop"))
            {
                if (stack.isEmpty())
                {
                    System.out.println(-1);
                } else
                {
                    System.out.println(stack.pop());
                }
            } else if (s.contains("size"))
            {
                System.out.println(stack.size());
            } else if (s.contains("empty"))
            {
                if (stack.isEmpty())
                {
                    System.out.println(1);
                } else
                {
                    System.out.println(0);
                }
            } else if (s.contains("top"))
            {
                if (stack.isEmpty())
                {
                    System.out.println(-1);
                } else
                {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
