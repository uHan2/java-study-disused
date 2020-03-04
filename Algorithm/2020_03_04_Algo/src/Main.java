import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        int count = 0;

        while(true)
        {
            if(total % 5 != 0)
            {
                if(total == 4 || total == 2 || total ==1)
                {
                    System.out.print("-1");
                    System.exit(0);
                }
                else
                {
                    total -= 3;
                    count ++;
                    if(total == 0)
                    {
                        break;
                    }
                }
            }
            else if(total % 5 ==0)
            {
                total -= 5;
                count ++;
                if(total == 0)
                {
                    break;
                }

            }

        }



        System.out.print(count);
    }
}