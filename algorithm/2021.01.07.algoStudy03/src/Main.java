import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
    public static int INF = (int) 1e9;
    public static int[][] graph = new int[101][101];
    public static int n, m;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++)
        {
            Arrays.fill(graph[i], INF);
        }

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (i == j)
                {
                    graph[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++)
        {

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st3.nextToken());
        int b = Integer.parseInt(st3.nextToken());

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                for (int k = 1; k <= n; k++)
                {
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }

        if (graph[a][b] == INF)
        {
            System.out.println(-1);
        } else
        {
            System.out.println(graph[1][b] + graph[b][a]);
        }
    }
}