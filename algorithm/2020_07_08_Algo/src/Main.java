import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{

    public static int computerNum;
    public static int computerEdge;

    public static int[][] computerMap;
    public static boolean[] visit;
    public static int count = 0;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computerNum = Integer.parseInt(br.readLine());
        computerEdge = Integer.parseInt(br.readLine());

        computerMap = new int[computerNum + 1][computerNum + 1];
        visit = new boolean[computerNum + 1];

        StringTokenizer str;
        for (int i = 0; i < computerEdge; i++)
        {
            str = new StringTokenizer(br.readLine());
            int com1 = Integer.parseInt(str.nextToken());
            int com2 = Integer.parseInt(str.nextToken());

            computerMap[com1][com2] = 1;
            computerMap[com2][com1] = 1;
        }

        dfs(1);
        System.out.print(count);
    }

    public static void dfs(int start)
    {

        visit[start] = true;

        for (int i = 1; i < visit.length; i++)
        {
            if (computerMap[start][i] == 1 && visit[i] == false)
            {
                count++;
                dfs(i);
            }
        }
    }
}