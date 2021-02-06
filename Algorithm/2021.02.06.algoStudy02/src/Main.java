import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static int N, M, result;
    public static int[][] map;
    public static int[] dRow = {0, 0, -1, 1};
    public static int[] dCol = {1, -1, 0, 0};
    public static int[][] wallMap;

    public static int sum()
    {
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if (wallMap[i][j] == 0)
                {
                    sum++;
                }
            }
        }

        return sum;
    }


    public static void virus(int row, int col)
    {
        for (int i = 0; i < 4; i++)
        {
            int nRow = row + dRow[i];
            int nCol = col + dCol[i];

            if (0 <= nRow && nRow < N && 0 <= nCol && nCol < M)
            {
                if (wallMap[nRow][nCol] == 0)
                {
                    wallMap[nRow][nCol] = 2;
                    virus(nRow, nCol);
                }
            }
        }
    }

    public static void dfs(int count)
    {
        if (count == 3)
        {
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    wallMap[i][j] = map[i][j];
                }
            }

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    if(wallMap[i][j] == 2)
                    {
                        virus(i, j);
                    }
                }
            }
            result = Math.max(result, sum());
            return;
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if(map[i][j] == 0)
                {
                    count++;
                    map[i][j] = 1;
                    dfs(count);
                    count--;
                    map[i][j] = 0;
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

        map = new int[N][M];
        wallMap = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
            {
                map[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        dfs(0);
        System.out.println(result);
    }
}