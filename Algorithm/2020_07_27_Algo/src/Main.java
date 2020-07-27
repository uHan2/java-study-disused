import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static int[][] map;
    static boolean[][][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;
    static int M;
    static int ans;

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());

        map = new int[N][M];
        visit = new boolean[N][M][2];

        for (int i = 0; i < N; i++)
        {
            String tmp = br.readLine();
            for (int j = 0; j < M; j++)
            {
                map[i][j] = tmp.charAt(j) - '0';
            }
        }

        ans = Integer.MAX_VALUE;

        bfs(0, 0, 1, 0);

        if (ans == Integer.MAX_VALUE)
        {
            System.out.print(-1);
            return;
        } else
        {
            System.out.print(ans);
            return;
        }

    }

    public static void bfs(int y, int x, int cnt, int drill)
    {
        Queue<Point> queue = new LinkedList<Point>();

        queue.offer(new Point(y, x, cnt, drill));

        while (!queue.isEmpty())
        {
            Point point = queue.poll();

            if (point.x == M - 1 && point.y == N - 1)
            {
                ans = point.cnt;
                return;
            }

            for (int i = 0; i < 4; i++)
            {
                int ny = point.y + dy[i];
                int nx = point.x + dx[i];

                if (ny >= 0 && ny < N && nx >= 0 && nx < M)
                {
                    if (map[ny][nx] == 1)
                    {
                        if (point.drill == 0 && visit[ny][nx][1] == false)
                        {
                            queue.offer(new Point(ny, nx, point.cnt + 1, 1));
                            visit[ny][nx][1] = true;
                        }
                    } else
                    {
                        if (visit[ny][nx][point.drill] == false)
                        {
                            queue.offer(new Point(ny, nx, point.cnt + 1, point.drill));
                            visit[ny][nx][point.drill] = true;
                        }
                    }
                }
            }
        }
    }

    static class Point
    {
        int y;
        int x;
        int cnt;
        int drill;

        Point(int y, int x, int cnt, int drill)
        {
            this.y = y;
            this.x = x;
            this.cnt = cnt;
            this.drill = drill;
        }
    }
}