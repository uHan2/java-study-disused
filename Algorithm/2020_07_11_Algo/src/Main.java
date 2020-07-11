import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static int[][] map;
    public static boolean[][] visit;
    public static int n;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static ArrayList<Integer> result = new ArrayList<Integer>();
    public static int wholeNum = 0;


    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++)
        {
            String input = br.readLine();

            for (int j = 0; j < input.length(); j++)
            {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (map[i][j] == 1 && visit[i][j] == false)
                {
                    bfs(i, j);
                }
            }
        }

        System.out.println(wholeNum);
        Collections.sort(result);

        for (int i = 0; i < result.size(); i++)
        {
            System.out.println(result.get(i));
        }
    }

    public static void bfs(int x, int y)
    {
        int numHouse = 1;
        Queue<Point> queue = new LinkedList<Point>();

        queue.offer(new Point(x, y));
        wholeNum++;

        while (!queue.isEmpty())
        {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++)
            {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n)
                {
                    if (map[nx][ny] == 1 && visit[nx][ny] == false)
                    {
                        visit[nx][ny] = true;
                        numHouse++;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
        }
        if (numHouse > 1)
        {
            numHouse--;
        }
        result.add(numHouse);
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