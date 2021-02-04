import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static int N, M, K, X;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int[] d;

    private static void bfs()
    {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(X);

        while (!q.isEmpty())
        {
            int now = q.poll();

            for (int i = 0; i < graph.get(now).size(); i++)
            {
                int next = graph.get(now).get(i);

                if (d[next] == -1)
                {
                    d[next] = d[now] + 1;
                    q.offer(next);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        d = new int[N+1];

        for (int i = 0; i <= N; i++)
        {
            graph.add(new ArrayList<Integer>());
            d[i] = -1;
        }

        for (int i = 0; i < M; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            graph.get(a).add(b);
        }

        d[X] = 0;

        bfs();

        boolean flag = false;

        for (int i = 1; i <= N; i++)
        {
            if (d[i] == K)
            {
                System.out.println(i);
                flag = true;
            }
        }

        if (!flag)
        {
            System.out.println(-1);
        }

    }
}
