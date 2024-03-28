import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());


        if (num > 2)
        {

            long[] dp = new long[num + 1];

            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <= num; i++)
            {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
            }

            bw.write(dp[num] + "");
        } else if (num >= 0 && num <= 2)
        {
            long[] dp = new long[3];

            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;

            bw.write(dp[num] + "");
        }

        bw.flush();


    }
}