import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum;



        for(int i = 1; i <= num; i++)
        {
            sum = 0;
            int j = i;
            while(j != 0)
            {
                sum += j % 10;
                j /= 10;
            }

            if(sum + i == num)
            {
                System.out.print(i);
                break;
            }
            else if(i == num)
            {
                System.out.print(0);
            }


        }
    }
}