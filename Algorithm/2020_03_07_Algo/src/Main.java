import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long tc = Long.parseLong(br.readLine());
        long count = 0;


        while(count < tc)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());
            long start = Long.parseLong(str.nextToken());
            long end = Long.parseLong(str.nextToken());

            end -= start;
            start -= start;


            bw.write(moveCount(end) + "\n");

            count++;


        }

        bw.close();



    }

    public static long moveCount(long num)
    {
        long i = 1;

        while(true)
        {
            if(num >= i * i && num <= (i + 1) * (i + 1))
            {
                if(num == i * i)
                {
                    return ((i * 2) - 1);
                }
                else if(num >= (((i + 1) * (i + 1)) - i) && num <= ((i + 1) * (i + 1)))
                {
                    return (i + 1) * 2 - 1;
                }
                else
                {
                    return ((i * 2));
                }
            }
            else
            {
                i++;
            }
        }
    }
}

