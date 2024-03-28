import java.io.*;
import java.util.*;

public class Main
{
    public static int[][] map = new int[9][9];
    public static ArrayList<Point> pointList = new ArrayList<Point>();


    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < map.length; i++)
        {
            String tmp = br.readLine();
            StringTokenizer st = new StringTokenizer(tmp);
            for (int j = 0; j < map[i].length; j++)
            {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if (map[i][j] == 0)
                {
                    pointList.add(new Point(i, j));
                }
            }
        }

        backTrack(0);
    }

    public static void backTrack(int cnt)
    {
        if (cnt == pointList.size())
        {
            for (int i = 0; i < map.length; i++)
            {
                for (int j = 0; j < map[i].length; j++)
                {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        for (int i = 1; i <= 9; i++)
        {
            int col = pointList.get(cnt).y;
            int row = pointList.get(cnt).x;

            if (checkRowAvail(i, row) && checkColAvail(i, col) && checkSmallBoxAvail(i, col, row))
            {
                map[col][row] = i;
                backTrack(cnt + 1);
                map[col][row] = 0;
            }
        }
    }

    public static boolean checkRowAvail(int num, int row)
    {
        for (int i = 0; i < 9; i++)
        {
            if (num == map[i][row])
            {
                return false;
            }
        }

        return true;
    }

    public static boolean checkColAvail(int num, int col)
    {
        for (int i = 0; i < 9; i++)
        {
            if (num == map[col][i])
            {
                return false;
            }
        }

        return true;
    }

    public static boolean checkSmallBoxAvail(int num, int col, int row)
    {
        int boxStartCol = convertNum(col);
        int boxStartRow = convertNum(row);

        for (int i = boxStartCol; i < boxStartCol + 3; i++)
        {
            for (int j = boxStartRow; j < boxStartRow + 3; j++)
            {
                if (num == map[i][j])
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static int convertNum(int num)
    {
        if (0 <= num && num < 3)
        {
            return 0;
        } else if (3 <= num && num < 6)
        {
            return 3;
        } else
        {
            return 6;
        }
    }

    static class Point
    {
        int y;
        int x;

        Point(int y, int x)
        {
            this.y = y;
            this.x = x;
        }
    }

}