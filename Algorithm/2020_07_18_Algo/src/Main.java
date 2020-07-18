import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    public static int[][] map;
    public static boolean[][] visit;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n;
    public static int m;


    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++)
        {
            String input = br.readLine();

            for (int j = 0; j < m; j++)
            {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        bfs(0, 0, 1);
    }

    public static void bfs(int x, int y, int count)
    {
        Queue<Point> queue = new LinkedList<Point>();
        queue.offer(new Point(x, y, count));
        visit[x][y] = true;

        while (!queue.isEmpty())
        {
            Point point = queue.poll();
            int cnt = point.count;

            if (point.x == n - 1 && point.y == m - 1)
            {
                System.out.print(cnt);
                break;
            }
            for (int i = 0; i < 4; i++)
            {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m)
                {
                    if (map[nx][ny] == 1 && visit[nx][ny] == false)
                    {
                        visit[nx][ny] = true;
                        queue.offer(new Point(nx, ny, point.count + 1));
                    }
                }
            }
        }
    }

    static class Point
    {
        int x;
        int y;
        int count;

        Point(int x, int y, int count)
        {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}