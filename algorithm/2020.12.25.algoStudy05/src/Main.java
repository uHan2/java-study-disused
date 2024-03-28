import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    public static int[] d = new int[101];

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < N; i++)
        {
            d[i] = Math.max(d[i-1], d[i-2] + arr[i]);
        }

        System.out.println(d[N-1]);
    }
}
