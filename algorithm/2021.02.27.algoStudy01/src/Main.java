import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Position
{
    private int row;
    private int col;

    public Position(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }
}

public class Main
{
    public static int n, l, r;
    public static int[][] map;
    public static int[][] uniMap;
    public static int[] dRow = {-1, 0, 1, 0};
    public static int[] dCol = {0, 1, 0, -1};

    public static int result = 0;

    public static void check(int row, int col, int index)
    {
        List<Position> unionList = new ArrayList<>();
        unionList.add(new Position(row, col));

        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(row, col));

        int sum = map[row][col];
        int count = 1;
        uniMap[row][col] = index;

        while (!q.isEmpty())
        {
            Position pos = q.poll();

            row = pos.getRow();
            col = pos.getCol();

            for (int i = 0; i < 4; i++)
            {
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];

                if (0 <= nRow && nRow < n && 0 <= nCol && nCol < n && uniMap[nRow][nCol] == -1
                        && l <= Math.abs(map[nRow][nCol] - map[row][col]) && Math.abs(map[nRow][nCol] - map[row][col]) <= r)
                {
                    q.offer(new Position(nRow, nCol));
                    uniMap[nRow][nCol] = index;
                    sum += map[nRow][nCol];
                    count++;
                    unionList.add(new Position(nRow, nCol));
                }
            }
        }

        for (int i = 0; i < unionList.size(); i++)
        {
            row = unionList.get(i).getRow();
            col = unionList.get(i).getCol();
            map[row][col] = sum / count;
        }

    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        uniMap = new int[n][n];


        for (int i = 0; i < map.length; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < map.length; j++)
            {
                map[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        while (true)
        {
            int index = 0;
            for (int i = 0; i < uniMap.length; i++)
            {
                for (int j = 0; j < uniMap.length; j++)
                {
                    uniMap[i][j] = -1;
                }
            }

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (uniMap[i][j] == -1)
                    {
                        check(i, j, index);
                        index++;
                    }
                }
            }
//            printUniMap();
//            printMap();

            if (index == n * n) break;
            result++;
        }

        System.out.println(result);

    }

    private static void printUniMap()
    {
        System.out.println();

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map.length; j++)
            {
                System.out.print(uniMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMap()
    {
        System.out.println();

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map.length; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
