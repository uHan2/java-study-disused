import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();


        for (int i = 0; i < tc; i++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = 0;

            int[][] arr = new int[n][m];
            int[][] dp = new int[n][m];

            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < m; k++)
                {
                    arr[j][k] = sc.nextInt();
                }
            }

            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < m; k++)
                {
                    dp[j][k] = arr[j][k];
                }
            }

            for (int j = 1; j < m; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    int leftUp, leftDown, left;

                    if (k == 0) leftUp = 0;
                    else leftUp = dp[k - 1][j - 1];

                    if(k == n-1) leftDown = 0;
                    else leftDown = dp[k + 1][j - 1];

                    left = dp[k][j - 1];

                    dp[k][j] = dp[k][j] + Math.max(leftUp, Math.max(leftDown, left));
                }
            }

            for (int j = 0; j < n; j++)
            {
                result = Math.max(result, dp[j][m - 1]);
            }
            System.out.println(result);

        }

    }
}
