import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static int[][] map;
    static boolean[][] visit;

    static int mapRow;
    static int mapCol;

    static int[] dRow = {0, 0, -1, 1};
    static int[] dCol = {1, -1, 0, 0};


    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        mapRow = Integer.parseInt(st.nextToken());
        mapCol = Integer.parseInt(st.nextToken());

        map = new int[mapRow][mapCol];
        visit = new boolean[mapRow][mapCol];

        for (int i = 0; i < mapRow; i++)
        {
            String s = br.readLine();
            for (int j = 0; j < mapCol; j++)
            {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0, 1);
    }

    static void bfs(int row, int col, int count)
    {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(row, col, count));
        visit[row][col] = true;

        while (!queue.isEmpty())
        {
            Point point = queue.poll();
            int moveCount = point.moveCount;

            if (point.row == mapRow - 1 && point.col == mapCol - 1)
            {
                System.out.println(moveCount);
                break;
            }

            for (int i = 0; i < 4; i++)
            {
                int moveRow = point.row + dRow[i];
                int moveCol = point.col + dCol[i];

                if (0 <= moveRow && moveRow < mapRow &&
                        0 <= moveCol && moveCol < mapCol)
                {
                    if (map[moveRow][moveCol] == 1 && visit[moveRow][moveCol] == false)
                    {
                        visit[moveRow][moveCol] = true;
                        queue.offer(new Point(moveRow, moveCol, moveCount + 1));
                    }
                }
            }
        }
    }

    static class Point
    {
        int row;
        int col;
        int moveCount;

        Point(int row, int col, int count)
        {
            this.row = row;
            this.col = col;
            this.moveCount = count;
        }
    }
}
