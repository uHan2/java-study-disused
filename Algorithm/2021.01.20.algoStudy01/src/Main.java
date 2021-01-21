import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
    static int N, K, L;
    static int[][] board;

    static int[] dRow = {0, 0, -1, 1}; // left, right, up, down
    static int[] dCol = {-1, 1, 0, 0};

    static List<Node> info = new ArrayList<>();

    static class Node
    {
        int time;
        char dir;

        public Node(int time, char dir)
        {
            this.time = time;
            this.dir = dir;
        }
    }

    static class Position
    {
        int row;
        int col;

        public Position(int row, int col)
        {
            this.row = row;
            this.col = col;
        }
    }

    public static int turn(int rot, char dir)
    {
        if (dir == 'L')
        {
            if (rot == 0) rot = 3;
            else if (rot == 1) rot = 2;
            else if (rot == 2) rot = 0;
            else if (rot == 3) rot = 1;
        } else
        {
            if (rot == 0) rot = 2;
            else if (rot == 1) rot = 3;
            else if (rot == 2) rot = 1;
            else if (rot == 3) rot = 0;
        }

        return rot;
    }

    public static int simulate()
    {
        int dir = 1;
        int time = 0;
        int turn = 0;

        int curRow = 1;
        int curCol = 1;

        Queue<Position> q = new LinkedList<>();

        q.offer(new Position(curRow, curCol));

        while (true)
        {
//            print();

            int nRow = curRow + dRow[dir];
            int nCol = curCol + dCol[dir];

            if (1 <= nRow && nRow <= N && 1 <= nCol && nCol <= N && board[nRow][nCol] != 3)
            {
                if (board[nRow][nCol] == 0)
                {
                    board[nRow][nCol] = 3;
                    q.offer(new Position(nRow, nCol));

                    Position prev = q.poll();

                    board[prev.row][prev.col] = 0;

                } else
                {
                    board[nRow][nCol] = 3;
                    q.offer(new Position(nRow, nCol));
                }
            } else
            {
                time++;
                break;
            }

            curRow = nRow;
            curCol = nCol;
            time++;

            if (turn < L && time == info.get(turn).time)
            {
                dir = turn(dir, info.get(turn).dir);
                turn++;
            }
        }

        return time;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        board = new int[N + 1][N + 1];

        board[1][1] = 3;

        K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            board[a][b] = 1;
        }

        L = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            char b = st.nextToken().charAt(0);

            info.add(new Node(a, b));
        }

        System.out.println(simulate());


    }

//    static void print()
//    {
//        for (int i = 1; i < board.length; i++)
//        {
//            for (int j = 1; j < board.length; j++)
//            {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
}
