import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
    public static int N, K;
    public static int S, X, Y;
    public static int[] dRow = {0, 0, -1, 1};
    public static int[] dCol = {1, -1, 0, 0};
    public static ArrayList<Virus> viruses = new ArrayList<>();
    public static int[][] map;

    static class Virus implements Comparable<Virus>
    {
        private int row;
        private int col;
        private int priority;
        private int second;

        public Virus(int row, int col, int priority, int second)
        {
            this.row = row;
            this.col = col;
            this.priority = priority;
            this.second = second;
        }

        @Override
        public int compareTo(Virus other)
        {
            if (this.priority < other.priority)
            {
                return -1;
            }
            return 1;
        }

        public int getRow()
        {
            return row;
        }

        public int getCol()
        {
            return col;
        }

        public int getPriority()
        {
            return priority;
        }

        public int getSecond()
        {
            return second;
        }
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++)
            {
                map[i][j] = Integer.parseInt(st2.nextToken());

                if (map[i][j] != 0)
                {
                    viruses.add(new Virus(i, j, map[i][j], 0));
                }
            }
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st3.nextToken());
        X = Integer.parseInt(st3.nextToken());
        Y = Integer.parseInt(st3.nextToken());

        Collections.sort(viruses);
        Queue<Virus> q = new LinkedList<>();

        for (int i = 0; i < viruses.size(); i++)
        {
            q.offer(viruses.get(i));
        }

        while (!q.isEmpty())
        {
            Virus virus = q.poll();

            if (virus.getSecond() == S) break;

            for (int i = 0; i < 4; i++)
            {
                int nRow = virus.getRow() + dRow[i];
                int nCol = virus.getCol() + dCol[i];

                if (0 <= nRow && nRow < N && 0 <= nCol && nCol < N)
                {
                    if (map[nRow][nCol] == 0)
                    {
                        map[nRow][nCol] = virus.getPriority();
                        q.offer(new Virus(nRow, nCol, virus.getPriority(), virus.getSecond() + 1));
                    }
                }
            }
        }

        System.out.println(map[X - 1][Y - 1]);
    }
}