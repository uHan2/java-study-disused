import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {

    }

    public static final int INF = (int) 1e9;
    public static int n, m, start; // 노드의 개수(N), 간선의 개수(M), 시작 노드 번호(Start)
    public static List<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static boolean[] visit = new boolean[10001];
    public static int[] d = new int[10001];

    public static int getSmallestNode()
    {
        int min_value = INF;
        int index = 0; // 가장 최단 거리가 짧은 노드의 인덱스

        for(int i = 1; i <= n; i++)
        {
            if(d[i] < min_value && !visit[i])
            {
                d[i] = min_value;
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

            for (int j = 0; j < graph.get(now).size(); j++)
            {
                int cost = d[now] + graph.get(now).get(j).getDistance();

                if(cost < d[graph.get(now).get(j).getIndex()])
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

        public void setIndex(int index)
        {
            this.index = index;
        }

        public int getDistance()
        {
            return distance;
        }

        public void setDistance(int distance)
        {
            this.distance = distance;
        }
    }
}
