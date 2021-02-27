import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution
{
    class Node
    {
        private int firRow;
        private int firCol;
        private int secRow;
        private int secCol;
        private int distance;

        public Node(int firRow, int firCol, int secRow, int secCol, int distance)
        {
            this.firRow = firRow;
            this.firCol = firCol;
            this.secRow = secRow;
            this.secCol = secCol;
            this.distance = distance;
        }

        public int getFirRow()
        {
            return firRow;
        }

        public int getFirCol()
        {
            return firCol;
        }

        public int getSecRow()
        {
            return secRow;
        }

        public int getSecCol()
        {
            return secCol;
        }

        public int getDistance()
        {
            return distance;
        }
    }

    public List<Node> nextPos(Node pos, int[][] board)
    {
        List<Node> nextPosList = new ArrayList<>();
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++)
        {
            int n1Row = pos.getFirRow() + dRow[i];
            int n1Col = pos.getFirCol() + dCol[i];
            int n2Row = pos.getSecRow() + dRow[i];
            int n2Col = pos.getSecCol() + dCol[i];
            int nDistance = pos.getDistance() + 1;

            if (board[n1Row][n1Col] == 0 && board[n2Row][n2Col] == 0)
            {
                nextPosList.add(new Node(n1Row, n1Col, n2Row, n2Col, nDistance));
            }
        }

        int[] hor = {-1, 1};
        if (pos.getFirRow() == pos.getSecRow())
        {
            for (int i = 0; i < 2; i++)
            {
                if (board[pos.getFirRow() + hor[i]][pos.getFirCol()] == 0 && board[pos.getSecRow() + hor[i]][pos.getSecCol()] == 0)
                {
                    nextPosList.add(new Node(pos.getFirRow(), pos.getFirCol(), pos.getFirRow() + hor[i], pos.getFirCol(), pos.getDistance() + 1));
                    nextPosList.add(new Node(pos.getSecRow(), pos.getSecCol(), pos.getSecRow() + hor[i], pos.getSecCol(), pos.getDistance() + 1));
                }
            }
        }

        int[] ver = {-1, 1};
        if (pos.getFirCol() == pos.getSecCol())
        {
            for (int i = 0; i < 2; i++)
            {
                if (board[pos.getFirRow()][pos.getFirCol() + ver[i]] == 0 && board[pos.getSecRow()][pos.getSecCol() + ver[i]] == 0)
                {

                    nextPosList.add(new Node(pos.getFirRow(), pos.getFirCol(), pos.getFirRow(), pos.getFirCol() + ver[i], pos.getDistance() + 1));
                    nextPosList.add(new Node(pos.getSecRow(), pos.getSecCol(), pos.getSecRow(), pos.getSecCol() + ver[i], pos.getDistance() + 1));
                }
            }
        }


        return nextPosList;
    }

    public int solution(int[][] board)
    {
        int n = board.length;
        int[][] newBoard = new int[n + 2][n + 2];

        for (int i = 0; i < newBoard.length; i++)
        {
            for (int j = 0; j < newBoard.length; j++)
            {
                newBoard[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                newBoard[i + 1][j + 1] = board[i][j];
            }
        }

        Queue<Node> q = new LinkedList<>();
        List<Node> visited = new ArrayList<>();

        q.offer(new Node(1, 1, 1, 2, 0));
        visited.add(new Node(1, 1, 1, 2, 0));

        while (!q.isEmpty())
        {
            Node node = q.poll();

            if (node.getFirRow() == n && node.getFirCol() == n || node.getSecRow() == n && node.getSecCol() == n)
            {
                return node.getDistance();
            }

            List<Node> nextNode = nextPos(node, newBoard);

            for (int i = 0; i < nextNode.size(); i++)
            {
                boolean flag = false;
                node = nextNode.get(i);

                for (int j = 0; j < visited.size(); j++)
                {
                    if (node.getFirRow() == visited.get(j).getFirRow() &&
                            node.getFirCol() == visited.get(j).getFirCol() &&
                            node.getSecRow() == visited.get(j).getSecRow() &&
                            node.getSecCol() == visited.get(j).getSecCol())
                    {
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                {
                    visited.add(node);
                    q.offer(node);
                }
            }
        }

        return 0;
    }

//    public static void main(String[] args)
//    {
//        Solution solution = new Solution();
//
//        int[][] tmp = {{0, 0, 0, 1, 1},{0, 0, 0, 1, 0},{0, 1, 0, 1, 1},{1, 1, 0, 0, 1},{0, 0, 0, 0, 0}};
//
//        System.out.println(solution.solution(tmp));
//    }
}