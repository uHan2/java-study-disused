class Solution
{
    public static int direction;
    public static int[] dRow = {-1, 0, 1, 0};
    public static int[] dCol = {0, 1, 0, -1};
    //  0
    //3   1
    //  2

    public static void turn_left()
    {
        direction -= 1;
        if (direction == -1) direction = 3;
    }

    public static void turn_right()
    {
        direction += 1;
        if (direction == 4) direction = 0;
    }

    public int solution(int[][] office, int r, int c, String[] move)
    {
        int answer = office[r][c];
        office[r][c] = 0;
        int mapSize = office.length;

        direction = 0;

        for (int i = 0; i < move.length; i++)
        {
            switch (move[i])
            {
                case "go":
                    int nRow = r + dRow[direction];
                    int nCol = c + dCol[direction];

                    if (0 <= nRow && nRow < mapSize && 0 <= nCol && nCol < mapSize)
                    {
                        if (office[nRow][nCol] != -1)
                        {
                            answer += office[nRow][nCol];
                            office[nRow][nCol] = 0;
                            r = nRow;
                            c = nCol;
                        }else
                        {
                            break;
                        }
                    }
                    break;
                case "right":
                    turn_right();
                    break;
                case "left":
                    turn_left();
                    break;
            }
        }
        return answer;
    }
}