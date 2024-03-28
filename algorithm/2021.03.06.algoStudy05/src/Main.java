import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> soldier = new ArrayList<>();
        int[] dp = new int[n];
        int result = 0;

        Arrays.fill(dp, 1);


        for (int i = 0; i < n; i++)
        {
            soldier.add(sc.nextInt());
        }

        Collections.reverse(soldier);

        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (soldier.get(j) < soldier.get(i))
                {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }

        Arrays.sort(dp);

        result = n - dp[n - 1];

        System.out.println(result);

    }
}
