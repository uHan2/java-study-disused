import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int row = Integer.parseInt(br.readLine());


        String[][] map = new String[row][2];

        for (int i = 0; i < row; i++)
        {
            st = new StringTokenizer(br.readLine());
            map[i][0] = st.nextToken();
            map[i][1] = st.nextToken();
        }

        Arrays.sort(map, new Comparator<String[]>()
        {
            @Override
            public int compare(String[] o1, String[] o2)
            {
                int score1 = Integer.parseInt(o1[1]);
                int score2 = Integer.parseInt(o2[1]);
                return Integer.compare(score1, score2);
            }
        });

        for (int i = 0; i < row; i++)
        {
            System.out.print(map[i][0] + " ");
        }
    }
}
