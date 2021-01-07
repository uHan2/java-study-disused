import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
    public static int n, m, start;
    public static int INF = (int) 1e9;
    public static List<ArrayList<Node>> graph = new ArrayList<>();
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
            if(d[i] == INF)
            {
                System.out.println("INFINITY");
            }else
            {
                System.out.println(d[i]);
            }
        }

    }

    public static void dijkstra(int start)
    {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.offer(new Node(start, 0));
        d[start] = 0;
        while(!pq.isEmpty())
        {
            Node node = pq.poll();

            int distance = node.getDistance();
            int now = node.getIndex();

            if(d[now] < distance)
            {
                continue;
            }

            for (int i = 0; i < graph.get(now).size(); i++)
            {
                int cost = d[now] + graph.get(now).get(i).getDistance();

                if(cost < d[graph.get(now).get(i).getIndex()])
                {
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }

        }
    }

    static class Node implements Comparable<Node>
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

        @Override
        public int compareTo(Node other)
        {
            if (this.distance < other.distance)
            {
                return -1;
            } else
            {
                return 1;
            }
        }
    }
}
