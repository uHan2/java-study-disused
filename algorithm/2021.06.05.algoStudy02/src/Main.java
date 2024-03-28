import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens())
            {
                StringBuilder sb = new StringBuilder(st.nextToken());
                String reversed = sb.reverse().toString();
                System.out.print(reversed + " ");
            }
        }

    }
}
