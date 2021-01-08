import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static int n, m;
    public static int[] parent = new int[10001];

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++)
        {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            unionParent(a, b);
        }

        System.out.print("각 원소가 속한 집합: ");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(findParent(i) + " ");
        }
        System.out.println();

        // 부모 테이블 내용 출력하기
        System.out.print("부모 테이블: ");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(parent[i] + " ");
        }
        System.out.println();

    }

    public static int findParent(int x)
    {
        if (x == parent[x])
        {
            return x;
        }
        return parent[x] = findParent(parent[x]);
    }

    public static void unionParent(int a, int b)
    {
        a = findParent(a);
        b = findParent(b);

        if (a < b)
        {
            parent[b] = a;
        } else
        {
            parent[a] = b;
        }
    }
}
