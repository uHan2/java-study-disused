import java.io.*;
import java.util.*;

public class Main
{
    public static int cnt = 0;
    public static boolean[] checkCol;
    public static boolean[] checkUpCross;
    public static boolean[] checkDownCross;
    public static int N;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        checkCol = new boolean[N];
        checkUpCross = new boolean[2 * N];
        checkDownCross = new boolean[2 * N];

        dfs(0);

        System.out.print(cnt);
    }

    public static void dfs(int cur)
    {
        if (cur == N)
        {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++)
        {
            if (checkCol[i] == false && checkUpCross[i + cur] == false && checkDownCross[cur - i + N] == false)
            {
                checkCol[i] = true;
                checkUpCross[i + cur] = true;
                checkDownCross[cur - i + N] = true;

                dfs(cur + 1);

                checkCol[i] = false;
                checkUpCross[i + cur] = false;
                checkDownCross[cur - i + N] = false;
            }


        }
    }
}