import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    static int m = 0;
    static int mulCount = m;
    static int count = 1;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());

        if (m == 0)
        {
            m = n;
        }

        n = cal(n, m);
        m = fac(m);

        System.out.print(n / m);
    }

    public static int cal(int n, int m)
    {


        if (count == m)
        {
            return n;
        } else
        {
            count++;
            return cal(n - 1, m) * n;
        }
    }

    public static int fac(int m)
    {
        if (m <= 1)
        {
            return m;
        } else
        {
            return fac(m - 1) * m;
        }
    }
}