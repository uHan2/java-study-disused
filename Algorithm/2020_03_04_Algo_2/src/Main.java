import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int count = 1;

        for(int i = 0; i < count ; i++)
        {
            if(num == 1)
            {
                System.out.print(count);
            }
            else if(num  >=  (2 + (3 * (i + 1) * i)) && num <= 1 + (3 * (i + 2) * (i + 1)))
            {
                System.out.print(count + 1);
            }
            else
            {
                count++;
            }
        }




    }
}