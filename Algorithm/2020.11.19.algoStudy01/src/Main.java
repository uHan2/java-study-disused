import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = 0;

        while (true)
        {
            int target = (n / k) * k;
            result += (n - target);
            n = target;

            if (n < k)
            {
                break;
            }

            result += 1;
            n /= k;
        }

        result += (n - 1);
        System.out.println(result);
    }

}