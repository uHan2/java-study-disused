import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static int n, m;
    public static int[] parent;

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

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());

            if(a == 0) unionParent(b, c);
            else
            {
                if(findParent(b) == findParent(c)) System.out.println("YES");
                else System.out.println("NO");
            }
        }

    }

    public static int findParent(int a)
    {
        if (a == parent[a])
        {
            return a;
        }
        return parent[a] = findParent(parent[a]);
    }

    public static void unionParent(int a, int b)
    {
        a = findParent(a);
        b = findParent(b);

        if (a < b) parent[b] = a;
        else parent[a] = b;
    }
}
