import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main
{
    public static int n, m;
    public static List<Edge> edges = new ArrayList<>();
    public static int[] parent;
    public static int result;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];

        for (int i = 1; i <= n; i++)
        {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int nodeA = Integer.parseInt(st2.nextToken());
            int nodeB = Integer.parseInt(st2.nextToken());
            int cost = Integer.parseInt(st2.nextToken());

            edges.add(new Edge(cost, nodeA, nodeB));
        }

        Collections.sort(edges);
        int willBeDeletedLoad = 0;

        for (int i = 0; i < edges.size(); i++)
        {
            int cost = edges.get(i).getDistance();
            int nodeA = edges.get(i).getNodeA();
            int nodeB = edges.get(i).getNodeB();

            if(findParent(nodeA) != findParent(nodeB))
            {
                unionParent(nodeA, nodeB);
                result += cost;
                willBeDeletedLoad = cost;
            }
        }

        System.out.println(result - willBeDeletedLoad);
    }

    public static int findParent(int a)
    {
        if(a == parent[a]) return a;
        return parent[a] = findParent(parent[a]);
    }

    public static void unionParent(int a, int b)
    {
        a = findParent(a);
        b = findParent(b);

        if(a < b) parent[b] = a;
        else parent[a] = b;
    }

    static class Edge implements Comparable<Edge>
    {
        private int distance;
        private int nodeA;
        private int nodeB;

        public Edge(int distance, int nodeA, int nodeB)
        {
            this.distance = distance;
            this.nodeA = nodeA;
            this.nodeB = nodeB;
        }

        public int getDistance()
        {
            return distance;
        }

        public int getNodeA()
        {
            return nodeA;
        }

        public int getNodeB()
        {
            return nodeB;
        }

        @Override
        public int compareTo(Edge other)
        {
            if (this.distance < other.distance) return -1;
            else return 1;
        }
    }
}
