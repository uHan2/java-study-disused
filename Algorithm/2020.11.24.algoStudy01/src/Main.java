import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    static int[][] map;
    static boolean[][] visit;
    static int[] dRow = {0, 0, -1, 1};
    static int[] dCol = {1, -1, 0, 0};
    static int count = 0;
    static int mapRow;
    static int mapCol;

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

        for (int i = 0; i < mapRow; i++)
        {
            for (int j = 0; j < mapCol; j++)
            {
                if (map[i][j] == 0 && visit[i][j] == false)
                {
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void dfs(int row, int col)
    {
        if (visit[row][col])
        {
            return;
        }

        visit[row][col] = true;

        for (int i = 0; i < 4; i++)
        {
            int moveRow = row + dRow[i];
            int moveCol = col + dCol[i];

            if (0 <= moveRow && moveRow < mapRow &&
                    0 <= moveCol && moveCol < mapCol)
            {
                if (map[moveRow][moveCol] == 0 && visit[moveRow][moveCol] == false)
                {
                    dfs(moveRow, moveCol);
                }
            }
        }
    }
}
