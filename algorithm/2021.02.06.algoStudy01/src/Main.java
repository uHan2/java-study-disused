import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
    public static int N;
    public static int M;
    public static int[][] map;
    public static ArrayList<Position> chicken = new ArrayList<>();
    public static ArrayList<Position> home = new ArrayList<>();

    static class Combination
    {
        private int n;
        private int r;
        private int[] now;
        private ArrayList<ArrayList<Position>> result;

        public Combination(int n, int r)
        {
            this.n = n;
            this.r = r;
            this.now = new int[r];
            this.result = new ArrayList<ArrayList<Position>>();
        }

        public ArrayList<ArrayList<Position>> getResult()
        {
            return result;
        }

        public void combination(ArrayList<Position> arr, int depth, int index, int target)
        {
            if (depth == r)
            {
                ArrayList<Position> temp = new ArrayList<>();

                for (int i = 0; i < now.length; i++)
                {
                    temp.add(arr.get(now[i]));
                }
                result.add(temp);
                return;
            }

            if (target == n) return;

            now[index] = target;
            combination(arr, depth + 1, index + 1, target + 1);
            combination(arr, depth, index, target + 1);
        }
    }

    static class Position
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

    public static int getSum(ArrayList<Position> candidates)
    {
        int result = 0;

        for (int i = 0; i < home.size(); i++)
        {
            int hRow = home.get(i).getRow();
            int hCol = home.get(i).getCol();

            int tmp = (int) 1e9;

            for (int j = 0; j < candidates.size(); j++)
            {
                int cRow = candidates.get(j).getRow();
                int cCol = candidates.get(j).getCol();
                tmp = Math.min(tmp, Math.abs(hRow - cRow) + Math.abs(hCol - cCol));
            }

            result += tmp;
        }

        return result;
    }


    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int i = 0; i < map.length; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < map.length; j++)
            {
                map[i][j] = Integer.parseInt(st2.nextToken());

                if (map[i][j] == 1)
                {
                    home.add(new Position(i, j));
                } else if (map[i][j] == 2)
                {
                    chicken.add(new Position(i, j));
                }
            }
        }

        Combination comb = new Combination(chicken.size(), M);
        comb.combination(chicken, 0, 0, 0);
        ArrayList<ArrayList<Position>> chickenList = comb.getResult();

        int result = (int) 1e9;

        for (int i = 0; i < chickenList.size(); i++)
        {
            result = Math.min(result, getSum(chickenList.get(i)));
        }

        System.out.println(result);
    }
}