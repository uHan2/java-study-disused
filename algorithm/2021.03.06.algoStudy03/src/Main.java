import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int result = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                int up, leftUp;

                if (j == 0) leftUp = 0;
                else leftUp = arr[i - 1][j - 1];

                if (j == i) up = 0;
                else up = arr[i - 1][j];

                arr[i][j] = arr[i][j] + Math.max(leftUp, up);
            }
        }

        for (int i = 0; i < n; i++)
        {
            result = Math.max(result, arr[n - 1][i]);
        }

        System.out.println(result);
    }
}
