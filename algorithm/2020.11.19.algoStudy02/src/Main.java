import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nightPos = br.readLine();

        int row = nightPos.charAt(1) - '0';
        int col = nightPos.charAt(0) - 'a' + 1;

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int count = 0;

        for (int i = 0; i < 8; i++)
        {
            int nextRow = row + dx[i];
            int nextColumn = col + dy[i];

            if ((1 <=nextRow && nextRow <= 8) &&  (1 <= nextColumn && nextColumn <= 8))
            {
                count += 1;
            }
        }

        System.out.println(count);
    }

}