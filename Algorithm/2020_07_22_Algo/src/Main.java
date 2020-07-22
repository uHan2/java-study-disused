import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static int[][][] map;
    static boolean[][][] visit;
    static int[] total;

    static int m;
    static int n;
    static int h;

    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        map = new int[h][n][m];
        visit = new boolean[h][n][m];

        for (int k = 0; k < h; k++)
        {
            for (int i = 0; i < n; i++)
            {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++)
                {
                    map[k][i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }


        bfs();

        // System.out.println();

        // for(int k = 0; k < h; k++)
        // {
        //     for(int i = 0; i < n; i++)
        //     {
        //         for(int j = 0; j < m; j++)
        //         {
        //             System.out.print(map[k][i][j] + " ");
        //         }
        //         System.out.println();
        //     }
        // }

        int max = 0;

        for (int k = 0; k < h; k++)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if (map[k][i][j] == 0)
                    {
                        System.out.print(-1);
                        return;
                    }

                    max = Math.max(map[k][i][j], max);
                }
            }
        }

        System.out.print(max - 1);


    }

    public static void bfs()
    {
        Queue<Point> queue = new LinkedList<Point>();

        for (int k = 0; k < h; k++)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if (map[k][i][j] == 1)
                    {
                        queue.offer(new Point(k, i, j));
                        visit[k][i][j] = true;
                    }

                }
            }
        }


        while (!queue.isEmpty())
        {
            Point point = queue.poll();

            for (int i = 0; i < 6; i++)
            {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                int nz = point.z + dz[i];

                if (0 <= nz && nz < h && 0 <= ny && ny < n && 0 <= nx && nx < m)
                {
                    if (map[nz][ny][nx] == 0 && visit[nz][ny][nx] == false)
                    {
                        queue.offer(new Point(nz, ny, nx));
                        visit[nz][ny][nx] = true;
                        map[nz][ny][nx] = map[point.z][point.y][point.x] + 1;
                    }
                }
            }


        }
    }

    static class Point
    {
        int x;
        int y;
        int z;

        Point(int z, int y, int x)
        {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}