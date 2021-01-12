import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
    public static int n;
    public static List<ArrayList<Integer>> graph = new ArrayList<>();
    public static int[] d;
    public static int[] lTime;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        d = new int[n + 1];
        lTime = new int[n + 1];

        for (int i = 0; i <= n; i++)
        {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());

            lTime[i] = a;

            while (st.countTokens() != 1)
            {
                d[i]++;
                int x = Integer.parseInt(st.nextToken());
                graph.get(x).add(i);
            }
        }

        topologySort();

    }

    public static void topologySort()
    {
        int[] result = new int[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++)
        {
            result[i] = lTime[i];
        }

        for (int i = 1; i <= n; i++)
        {
            if (d[i] == 0) queue.offer(i);
        }

        while (!queue.isEmpty())
        {
            int now = queue.poll();

            for (int i = 0; i < graph.get(now).size(); i++)
            {
                result[graph.get(now).get(i)] = Math.max(result[graph.get(now).get(i)],
                        result[now] + lTime[graph.get(now).get(i)]);

                d[graph.get(now).get(i)]--;
                if (d[graph.get(now).get(i)] == 0)
                {
                    queue.offer(graph.get(now).get(i));
                }
            }
        }

        for (int i = 1; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}
