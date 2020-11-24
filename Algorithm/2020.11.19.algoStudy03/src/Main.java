import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    static int[][] map;
    static boolean[][] visit;
    static int playerDir;
    static int playerRowPos;
    static int playerColPos;
    //북동남서를 바라볼때 움직이는 경로
    static int[] dRow = {-1, 0, 1, 0};
    static int[] dCol = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int mapRow = Integer.parseInt(st.nextToken());
        int mapCol = Integer.parseInt(st.nextToken());

        map = new int[mapRow][mapCol];
        visit = new boolean[mapRow][mapCol];

        st = new StringTokenizer(br.readLine());
        playerRowPos = Integer.parseInt(st.nextToken());
        playerColPos = Integer.parseInt(st.nextToken());
        playerDir = Integer.parseInt(st.nextToken());

        visit[playerRowPos][playerColPos] = true;

        for (int i = 0; i < mapRow; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < mapCol; j++)
            {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int visitCount = 1;

        while (true)
        {
            turnPlayer();

            if ((map[playerRowPos + dRow[playerDir]][playerColPos + dCol[playerDir]] == 0) &&
                    (visit[playerRowPos + dRow[playerDir]][playerColPos + dCol[playerDir]] == false))
            {
                visit[playerRowPos + dRow[playerDir]][playerColPos + dCol[playerDir]] = true;
                visitCount++;

                playerRowPos += dRow[playerDir];
                playerColPos += dCol[playerDir];

                count = 0;
            }
            else
            {
                count++;
            }

            if(count == 4)
            {
                if(map[playerRowPos - dRow[playerDir]][playerColPos - dCol[playerDir]] == 1)
                {
                    break;
                }
                else
                {
                    count = 0;
                    playerRowPos -= dRow[playerDir];
                    playerColPos -= dCol[playerDir];
                }

            }
        }

        System.out.println(visitCount);
    }

    static void turnPlayer()
    {
        playerDir -= 1;

        if (playerDir < 0)
        {
            playerDir = 3;
        }
    }
}