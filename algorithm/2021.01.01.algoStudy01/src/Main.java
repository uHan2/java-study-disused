import java.io.*;
import java.util.*;

public class Main
{

    public static final int INF = (int) 1e9;
    public static int n, m, start; // 노드의 개수(N), 간선의 개수(M), 시작 노드 번호(Start)
    public static List<ArrayList<Node>> graph = new ArrayList<>();
    public static boolean[] visit = new boolean[10001];
    public static int[] d = new int[10001];

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++)
        {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());

            graph.get(a).add(new Node(b, c));
        }

        Arrays.fill(d, INF);

        dijkstra(start);

        for (int i = 1; i <= n; i++)
        {
            if (d[i] == INF)
            {
                System.out.println("INFINITY");
            } else
            {
                System.out.println(d[i]);
            }
        }

    }

    public static int getSmallestNode()
    {
        int min_value = INF;
        int index = 0; // 가장 최단 거리가 짧은 노드의 인덱스

        for (int i = 1; i <= n; i++)
        {
            if (d[i] < min_value && !visit[i])
            {
                min_value = d[i];
                index = i;
            }
        }

        return index;
    }

    public static void dijkstra(int start)
    {
        d[start] = 0; // 자기 자신 0으로
        visit[start] = true;

        for (int i = 0; i < graph.get(start).size(); i++)
        {
            d[graph.get(start).get(i).getIndex()] = graph.get(start).get(i).getDistance();
        }

        for (int i = 0; i < n - 1; i++)
        {
            int now = getSmallestNode();
            visit[now] = true;

            for (int j = 0; j < graph.get(now).size(); j++)
            {
                int cost = d[now] + graph.get(now).get(j).getDistance();

                if (cost < d[graph.get(now).get(j).getIndex()])
                {
                    d[graph.get(now).get(j).getIndex()] = cost;
                }
            }
        }
    }

    static class Node
    {
        private int index;
        private int distance;

        public Node(int index, int distance)
        {
            this.index = index;
            this.distance = distance;
        }

        public int getIndex()
        {
            return index;
        }

        public int getDistance()
        {
            return distance;
        }

    }
}