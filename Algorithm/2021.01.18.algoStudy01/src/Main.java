import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int half = s.length() / 2;

        String s1 = s.substring(0, half);
        String s2 = s.substring(half, s.length());

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < half; i++)
        {
            sum1 += num1 % 10;
            num1 /= 10;

            sum2 += num2 % 10;
            num2 /= 10;
        }

        if (sum1 == sum2) System.out.println("LUCKY");
        else System.out.println("READY");
    }
}
