import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
    public static int[] d = new int[10001];

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.fill(d, 10001);

        d[0] = 0;

        for (int i = 0; i < N; i++)
        {
            for (int j = arr[i]; j <= M; j++)
            {
                // (i - k)원을 만드는 방법이 존재하는 경우
                if (d[j - arr[i]] != 10001)
                {
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);
                }
            }
        }

        if (d[M] == 10001)
        { // 최종적으로 M원을 만드는 방법이 없는 경우
            System.out.println(-1);
        } else
        {
            System.out.println(d[M]);
        }

    }
}
