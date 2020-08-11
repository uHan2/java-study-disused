import java.io.*;

public class Main
{

    public static int count = 0;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rangeNum = Integer.parseInt(br.readLine());

        int i = 1;

        while(i <= rangeNum)
        {
            validTest(i);
            i++;
        }

        System.out.print(count);
    }

    public static void validTest(int num)
    {
        if(num >= 1 && num <= 9)
        {
            count++;
        }

        else if(num >= 10 && num <= 99)
        {
            count++;
        }

        else if(num >= 100 && num <= 999)
        {
            if((num / 100) - ((num % 100) / 10) == ((num % 100) / 10) - (num % 10))
            {
                count++;
            }
        }

        else if(num == 1000)
        {

        }
    }
}