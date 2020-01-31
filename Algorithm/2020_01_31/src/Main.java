import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int new_n = n;
        int count = 0;

        while(true)
        {
            int n2 = new_n / 10;
            int n1 = new_n % 10;

            int new_n2 = n1 + n2;

            if(new_n2 >= 10)
            {
                new_n2 = new_n2 % 10;
            }

            new_n = new_n2 + (n1 * 10);

            count++;

            if(new_n == n)
            {
                System.out.println(count);
                break;
            }
        }



    }
}
