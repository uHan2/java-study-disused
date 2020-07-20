import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;
    static int m;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        m = Integer.parseInt(str.nextToken());
        n = Integer.parseInt(str.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++)
        {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++)
            {
                map[i][j] = Integer.parseInt(str.nextToken());
            }
        }

        bfs();

        // for(int i = 0; i < map.length ; i++)
        // {
        //     for(int j = 0; j < map[i].length; j++)
        //     {
        //         System.out.print(map[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int max = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (map[i][j] == 0)
                {
                    System.out.print(-1);
                    return;
                }

                max = Math.max(max, map[i][j]);
            }
        }

        System.out.print(max - 1);

    }

    public static void bfs()
    {
        Queue<Point> queue = new LinkedList<Point>();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (map[i][j] == 1)
                {
                    queue.offer(new Point(i, j));
                    visit[i][j] = true;
                }
            }
        }


        while (!queue.isEmpty())
        {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++)
            {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m)
                {
                    if (map[nx][ny] == 0 && visit[nx][ny] == false)
                    {
                        queue.offer(new Point(nx, ny));
                        visit[nx][ny] = true;
                        map[nx][ny] = map[point.x][point.y] + 1;
                    }
                }
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