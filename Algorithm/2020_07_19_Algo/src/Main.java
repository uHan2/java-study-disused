import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main
{
    static int[][] map;
    static boolean[][] visit;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int m;
    static int n;
    static int k;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());

            m = Integer.parseInt(str.nextToken());
            n = Integer.parseInt(str.nextToken());
            k = Integer.parseInt(str.nextToken());

            int count = 0;
            map = new int[n][m];
            visit = new boolean[n][m];

            for (int j = 0; j < k; j++)
            {
                str = new StringTokenizer(br.readLine());

                int num1 = Integer.parseInt(str.nextToken());
                int num2 = Integer.parseInt(str.nextToken());

                map[num2][num1] = 1;
            }

            for (int a = 0; a < n; a++)
            {
                for (int b = 0; b < m; b++)
                {
                    if (map[a][b] != 0 && visit[a][b] == false)
                    {
                        dfs(a, b);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void dfs(int x, int y)
    {
        Point point = new Point(x, y);
        visit[x][y] = true;

        for (int i = 0; i < 4; i++)
        {
            int nx = point.x + dx[i];
            int ny = point.y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m)
            {
                if (map[nx][ny] == 1 && visit[nx][ny] == false)
                    dfs(nx, ny);
            }
        }
    }

    static class Point
    {
        int x;
        int y;

        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
}