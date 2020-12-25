import java.io.*;

public class Main
{
    public static int[] d = new int[1001];

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        d[1] = 1;
        d[2] = 3;

        for (int i = 3; i <= N; i++)
        {
            d[i] = d[i-1] + d[i-2] * 2;
            d[i] %= 796796;
        }

        System.out.println(d[N]);
    }
}
