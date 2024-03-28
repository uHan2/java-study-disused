import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Position
{
    private int Row;
    private int Col;

    public int getRow()
    {
        return Row;
    }

    public int getCol()
    {
        return Col;
    }

    public Position(int row, int col)
    {
        Row = row;
        Col = col;
    }
}

class Combination
{
    private int n;
    private int r;
    private int[] now;
    private ArrayList<ArrayList<Position>> positionList = new ArrayList<>();

    public Combination(int n, int r)
    {
        this.n = n;
        this.r = r;
        this.now = new int[r];
        this.positionList = new ArrayList<>();
    }

    public ArrayList<ArrayList<Position>> getPositionList()
    {
        return positionList;
    }

    public void combination(ArrayList<Position> positions, int depth, int index, int target)
    {
        if (depth == r)
        {
            ArrayList<Position> temp = new ArrayList<>();
            for (int i = 0; i < now.length; i++)
            {
                temp.add(positions.get(now[i]));
            }
            positionList.add(temp);
            return;
        }

        if (target == n) return;

        now[index] = target;

        combination(positions, depth + 1, index + 1, target + 1);
        combination(positions, depth, index, target + 1);
    }
}

public class Main
{
    static int N;

    static char[][] map;
    static ArrayList<Position> teacherPos = new ArrayList<>();
    static ArrayList<Position> emptyPos = new ArrayList<>();


    public static boolean watch(int row, int col, int dir)
    {
        if (dir == 0)
        {
            while (row >= 1)
            {
                if (map[row][col] == 'O')
                {
                    return false;
                }

                if (map[row][col] == 'S')
                {
                    return true;
                }

                row--;
            }
        }
        if (dir == 1)
        {
            while (col <= N)
            {
                if (map[row][col] == 'O')
                {
                    return false;
                }

                if (map[row][col] == 'S')
                {
                    return true;
                }

                col++;
            }
        }
        if (dir == 2)
        {
            while (row <= N)
            {
                if (map[row][col] == 'O')
                {
                    return false;
                }

                if (map[row][col] == 'S')
                {
                    return true;
                }

                row++;
            }
        }
        if (dir == 3)
        {
            while (col >= 1)
            {
                if (map[row][col] == 'O')
                {
                    return false;
                }

                if (map[row][col] == 'S')
                {
                    return true;
                }

                col--;
            }
        }
        return false;
    }

    public static boolean validate()
    {
        for (int i = 0; i < teacherPos.size(); i++)
        {
            int row = teacherPos.get(i).getRow();
            int col = teacherPos.get(i).getCol();

            for (int j = 0; j < 4; j++)
            {
                if (watch(row, col, j)) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new char[N + 1][N + 1];

        for (int i = 1; i <= N; i++)
        {
            String st = br.readLine();
            st = st.replaceAll(" ", "");
            for (int j = 1; j <= N; j++)
            {
                map[i][j] = st.charAt(j - 1);
                if (map[i][j] == 'X')
                {
                    emptyPos.add(new Position(i, j));
                }
                if (map[i][j] == 'T')
                {
                    teacherPos.add(new Position(i, j));
                }
            }
        }

        Combination comb = new Combination(emptyPos.size(), 3);
        comb.combination(emptyPos, 0, 0, 0);

        ArrayList<ArrayList<Position>> objectList = comb.getPositionList();

        boolean flag = false;

        for (int i = 0; i < objectList.size(); i++)
        {
            for (int j = 0; j < 3; j++)
            {
                int row = objectList.get(i).get(j).getRow();
                int col = objectList.get(i).get(j).getCol();
                map[row][col] = 'O';
            }

            if (!validate())
            {
                flag = true;
                break;
            }

            for (int j = 0; j < 3; j++)
            {
                int row = objectList.get(i).get(j).getRow();
                int col = objectList.get(i).get(j).getCol();
                map[row][col] = 'X';
            }
        }

        if (flag)
        {
            System.out.println("YES");
        } else
        {
            System.out.println("NO");
        }
    }
}