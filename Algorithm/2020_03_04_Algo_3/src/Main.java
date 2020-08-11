import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int n = 1;

        int a1 = 1;

        while(true)
        {
            int a2 = a1 + n;

            if(num >= a1 && num < a2)
            {
                if(n % 2 == 0)
                {
                    int index = num - a1 + 1 ;

                    System.out.print(index + "/" + (n - index + 1));

                    break;
                }
                else if(n % 2 != 0)
                {
                    int index = num - a1 + 1 ;

                    System.out.print((n - index + 1) + "/" + index);

                    break;
                }

            }
            else
            {
                a1 = a2;
                n++;
            }
        }
    }
}