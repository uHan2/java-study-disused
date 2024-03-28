import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] weightArr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < weightArr.length; i++)
        {
            weightArr[i] = Integer.parseInt(st2.nextToken());
        }

        int count = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (weightArr[i] != weightArr[j])
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
