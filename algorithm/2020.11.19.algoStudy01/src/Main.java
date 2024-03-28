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
        int count = 0;

        while(n != 1)
        {
            if(n % k == 0)
            {
                n /= k;
                count++;
            }
            else
            {
                n -= 1;
                count++;
            }
        }

        System.out.println(count);
    }

}