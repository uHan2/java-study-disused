import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int num1, num2 = 0;
        num1 = Integer.parseInt(str.nextToken(" "));
        num2 = Integer.parseInt(str.nextToken(" "));


        if(num1 % 10 > num2 % 10)
        {
            System.out.print(((num1 % 10) * 100) + (((num1 % 100) / 10) * 10) + (num1 / 100));

        }
        else if(num1 % 10 < num2 % 10)
        {
            System.out.print(((num2 % 10) * 100) + (((num2 % 100) / 10) * 10) + (num2 / 100));

        }
        else if(num1 % 10 == num2 % 10)
        {
            if((num1 % 100) / 10 > (num2 % 100) / 10)
            {
                System.out.print(((num1 % 10) * 100) + (((num1 % 100) / 10) * 10) + (num1 / 100));

            }
            else if((num1 % 100) / 10 < (num2 % 100) / 10)
            {
                System.out.print(((num2 % 10) * 100) + (((num2 % 100) / 10) * 10) + (num2 / 100));

            }
            else if((num1 % 100) / 10 == (num2 % 100) / 10)
            {
                if ((num1 / 100) > (num2 / 100))
                {
                    System.out.print(((num1 % 10) * 100) + (((num1 % 100) / 10) * 10) + (num1 / 100));

                }
                else if ((num1 / 100) < (num2 / 100))
                {
                    System.out.print(((num2 % 10) * 100) + (((num2 % 100) / 10) * 10) + (num2 / 100));

                }
            }
        }

    }
}